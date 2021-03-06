/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller.api.wechat;

import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-14 16:22
 */
@RequestMapping("/api/wechat/sdk/signture")
@RestController
public class WxSdkSigntureController {

	@Autowired
	WxMpService mpService;
	@ApiOperation(value = "微信sdk配置信息获取接口.",notes = "需要传入调用该接口的页面的url。")
	@GetMapping
	public WxJsapiSignature config(String url) throws WxErrorException {
		return mpService.createJsapiSignature(url);
	}
}
