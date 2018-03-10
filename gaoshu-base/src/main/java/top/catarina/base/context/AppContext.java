/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package top.catarina.base.context;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @author langhsu
 */

@Data
@Component
public class AppContext {

	/**
	 * 网站地址
	 */
	@Value("${app.domain}")
	private String domain = "localhost";
	/**
	 * 微信支付后微信微信服务器异步通知链接
	 */
	private String notifyUri="/api/wechat/pay/notify";


	/*
	 * 文件存储-根目录
	 */
	//@Value("#{'${app.store.root}'}")
	private String root = this.getClass().getClassLoader().getResource("").getPath();

	/*
	 * 文件存储-原文件目录
	 */

	private String origDir = "/store/orig";

	/*
	 * 文件存储-压缩目录
	 */
	private String thumbsDir = "/store/thumbs";

	/**
	 * 文件储存-快照目录
	 */
	private String screenshotDir = "/store/screenshot";

	/**
	 * 文件存储-头像目录
	 */
	private String avaDir = "/store/ava";

	/*
	 * 文件存储-临时文件目录
	 */
	private String tempDir = "/store/temp";

	/*
	 * 系统配置信息
	 * - 在 StartupListener 类中加载
	 */
	public Map<String, String> config;

}
