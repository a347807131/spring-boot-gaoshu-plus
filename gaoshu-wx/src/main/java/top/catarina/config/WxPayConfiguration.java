/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.config;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 16:09
 */

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Binary Wang
 */
@Configuration
@ConditionalOnClass(WxPayService.class)
@EnableConfigurationProperties(WxPayProperties.class)
public class WxPayConfiguration {

	@Autowired
	private WxPayProperties properties;

	@Bean
	@ConditionalOnMissingBean
	public WxPayConfig config() {
		WxPayConfig payConfig = new WxPayConfig();
		payConfig.setAppId(this.properties.getAppId());
		payConfig.setMchId(this.properties.getMchId());
		payConfig.setMchKey(this.properties.getMchKey());
		payConfig.setKeyPath(this.properties.getKeyPath());

		return payConfig;
	}

	@Bean
	//@ConditionalOnMissingBean
	public WxPayService wxPayService(WxPayConfig payConfig) {
		WxPayService wxPayService = new WxPayServiceImpl();
		wxPayService.setConfig(payConfig);
		return wxPayService;
	}

}
