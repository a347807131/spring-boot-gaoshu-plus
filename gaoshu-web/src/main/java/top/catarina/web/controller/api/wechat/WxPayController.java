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
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.persist.entity.Order;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.OrderService;
import top.catarina.core.persist.service.UserService;
import top.catarina.web.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

import static top.catarina.base.utils.IPUtils.getIpAddr;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 19:15
 */
@RestController
@RequestMapping(Consts.PAY_PORTAL_URI)
public class WxPayController {

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
	 * @param user  当前用户
	 * @param golds 金额
	 * @return 传给器器前端的参数
	 * @throws WxPayException 微信支付异常
	 */
	@RequestMapping(params = "method=recharge")
	public Object createOrder(@CurrentUser User user,
	                          @RequestParam("golds") int golds,
	                          HttpServletRequest request) throws Exception {

		Order order = new Order();
		order.setOpenId(user.getOpenId());
		order.setTotalFee(golds * 10);
		order.setSpbillCreateIp(getIpAddr(request));
		long orderId = orderService.create(order);

		WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
		BeanUtils.copyProperties(orderService.get(orderId), orderRequest);

		//设置付快后微信给商家的后台通知
		orderRequest.setNotifyURL(appContext.getConfig().get("notifyUrl"));
		return wxPayService.createOrder(orderRequest);
	}

	@GetMapping(params = "method=withdraw")
	public Object withDraw(@CurrentUser User user,
	                       @RequestParam("golds") int golds,
	                       HttpServletRequest request) {
		userService.changeGolds(user.getId(),golds);

		return null;
	}

	/**
	 * 支付完成后，微信后台通过此接口异步通知商务
	 *
	 * @return 成功处理的xml消息
	 * @throws WxPayException 微信支付异常
	 */
	@RequestMapping("notify")
	public String notifies(@RequestBody InputStream inputStream) throws WxPayException {
		String resposeBody = inputStream.toString();
		WxPayOrderNotifyResult notifyResult = wxPayService.parseOrderNotifyResult(resposeBody);
		orderService.complete(Long.parseLong(notifyResult.getOutTradeNo()));

		return "<xml>\n" +
				"  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
				"  <return_msg><![CDATA[OK]]></return_msg>\n" +
				"</xml>";
	}

}
