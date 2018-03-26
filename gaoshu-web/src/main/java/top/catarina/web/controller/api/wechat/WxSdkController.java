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
import lombok.extern.slf4j.Slf4j;
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
 * 微信sdk配置信息获取接口
 */
@Slf4j
@RequestMapping("/api/wechat/sdk")
@RestController
public class WxSdkController {

	@Autowired
	WxMpService mpService;

	@ApiOperation(value = "微信sdk配置信息获取接口.",notes = "需要传入调用该接口的页面的url。")
	@GetMapping(value = "signture")
	public WxJsapiSignature config(String url) throws WxErrorException {
		WxJsapiSignature signature = mpService.createJsapiSignature(url);
		log.info("接受到前台微信sdk配置请求。"+signature);
		return signature;
	}
}
