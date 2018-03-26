/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller.api.wechat;

import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxEntPayRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxEntPayResult;
import com.github.binarywang.wxpay.bean.result.WxPayBaseResult;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.annotation.Log;
import top.catarina.core.persist.entity.Order;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.OrderService;
import top.catarina.core.persist.service.UserService;
import top.catarina.web.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.Date;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 19:15
 */
@Api("微信支付相关控制器.")
@RestController
@RequestMapping(Consts.PAY_PORTAL_URI)
public class WxPayController extends BaseController {

	@Autowired
	WxPayService wxPayService;
	@Autowired
	OrderService orderService;
	@Autowired
	AppContext appContext;
	@Autowired
	UserService userService;

	/**
	 * 暂时只设置必要参数，后续根据需求添加参数
	 *
	 * @param golds 金额
	 * @return 传给器器前端的参数
	 * @throws WxPayException 微信支付异常
	 */
	@ApiOperation("创建微信预支付与本地服务器订单订单的接口")
	//@Log("用户发起退款")
	@GetMapping(params = "method=recharge")
	public Object createOrder(@CurrentUser User user,
	                          @RequestParam("golds") int golds,
	                          HttpServletResponse response) throws Exception {


		Order order = new Order();
		order.setOpenid(user.getOpenId());
		order.setTotalFee(golds * 10);
		order.setSpbillCreateIp(getIpAddr());
		order.setBody("金币充值");
		order.setTradeType(WxPayConstants.TradeType.JSAPI);
		long orderId = orderService.create(order);

		WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
		BeanUtils.copyProperties(orderService.get(orderId), orderRequest);

		//设置付快后微信给商家的后台通知
		orderRequest.setNotifyURL(appContext.getConfig().get("notifyUrl"));

		return wxPayService.createOrder(orderRequest);
	}

	/**
	 * 发放红包接口，发放需要审核
	 * @param golds 数量、必须为12的倍数
	 * @return jssdk调用需要的参数
	 */
	@ApiOperation("用户提现接口")
	@GetMapping(params = "method=withdraw")
	public Object withDraw(@CurrentUser User user,
	                       @RequestParam("golds") int golds,
	                       HttpServletRequest request) throws Exception {

		int money= (int) (golds*Consts.RATE_TO_RMB);

		WxEntPayRequest entPayRequest = new WxEntPayRequest();
		entPayRequest.setAmount(money);
		entPayRequest.setSpbillCreateIp(getIpAddr());
		entPayRequest.setOpenid(user.getOpenId());
		//不校验微信用户真实姓名
		entPayRequest.setCheckName(WxPayConstants.CheckNameOption.NO_CHECK);
		//
		entPayRequest.setDescription("提现.");


		WxEntPayResult result = wxPayService.entPay(entPayRequest);

		userService.changeGolds(user.getId(),-golds);

		//开发阶段返回的完成企业支付的结果
		return result;
	}

	/**
	 * 支付完成后，微信后台通过此接口异步通知商务
	 *
	 * @return 成功处理的xml消息
	 * @throws WxPayException 微信支付异常
	 */
	@ApiOperation("支付成功后微信服务器异步通知接口。")
	@RequestMapping("notify")
	public String notifies(@RequestBody InputStream inputStream) throws WxPayException {
		String resposeBody = inputStream.toString();
		WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(resposeBody);
		// 结果正确
		String orderId = result.getOutTradeNo();
		String tradeNo = result.getTransactionId();
		String totalFee = WxPayBaseResult.feeToYuan(result.getTotalFee());

		int golds= (int) (result.getTotalFee()*Consts.RETE_TO_GOLD);

		//自己处理订单的业务逻辑，需要判断订单是否已经支付过，否则可能会重复调用
		orderService.complete(Long.parseLong(result.getOutTradeNo()));
		userService.changeGolds(getUserId(),golds);

		return "<xml>\n" +
				"  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
				"  <return_msg><![CDATA[OK]]></return_msg>\n" +
				"</xml>";
	}

}
