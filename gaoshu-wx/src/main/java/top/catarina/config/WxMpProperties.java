/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-09 17:12
 */
@Data
@ConfigurationProperties(prefix = "wechat.mp")
public class WxMpProperties {
	/**
	 * 设置微信公众号的appid
	 */
	private String appId;

	/**
	 * 设置微信公众号的app secret
	 */
	private String secret;

	/**
	 * 设置微信公众号的token
	 */
	private String token;

	/**
	 * 设置微信公众号的EncodingAESKey
	 */
	private String aesKey;
}
