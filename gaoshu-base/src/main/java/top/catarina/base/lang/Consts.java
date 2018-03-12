/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.base.lang;

/**
 * 储存一些常用的数据
 *
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 18:51
 */
public interface Consts {
	/**
	 * 热度步数
	 */
	int IDENTITY_STEP = 1;
	/**
	 * 默认压缩后的像素
	 */
	int PIC_SIZE=50;
	/**
	 * 默认头像
	 */
	String DEFAULT_AVATAR = "/static/image/avatar/default.png";
	/**
	 * 存放在session中用户的索引标识
	 */
	String USER_ID = "user_id";
	/**
	 * 公众号接入接口
	 */
	String MP_PORTAL_URI="/api/wechat/mp";
	/**
	 * 认证回调入口
	 */
	String MP_OAUTH_CALLBACK_URI=MP_PORTAL_URI+"/oauth/callback";
	/**
	 * 该项目微信支付接口入口
	 */
	String PAY_PORTAL_URI="/api/wechat/pay";

	String PAY_NOTIFY_CALLBACK_URI=PAY_PORTAL_URI+"/notify";


}
