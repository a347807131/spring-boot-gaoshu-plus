/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.constant.WxMpEventConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.catarina.wx.mp.handler.*;

import static me.chanjar.weixin.common.api.WxConsts.*;
/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-09 17:54
 */
@Configuration
@ConditionalOnClass(WxMpService.class)
@EnableConfigurationProperties(WxMpProperties.class)
public class WxMpConfiguration {
	@Autowired
	protected LogHandler logHandler;
	@Autowired
	protected NullHandler nullHandler;
	@Autowired
	protected KfSessionHandler kfSessionHandler;
	@Autowired
	protected StoreCheckNotifyHandler storeCheckNotifyHandler;
	@Autowired
	private WxMpProperties properties;
	@Autowired
	private LocationHandler locationHandler;
	@Autowired
	private MenuHandler menuHandler;
	@Autowired
	private MsgHandler msgHandler;
	@Autowired
	private UnsubscribeHandler unsubscribeHandler;
	@Autowired
	private SubscribeHandler subscribeHandler;

	@Bean
	@ConditionalOnMissingBean
	public WxMpConfigStorage configStorage() {
		WxMpInMemoryConfigStorage configStorage = new WxMpInMemoryConfigStorage();
		configStorage.setAppId(this.properties.getAppId());
		configStorage.setSecret(this.properties.getSecret());
		configStorage.setToken(this.properties.getToken());
		configStorage.setAesKey(this.properties.getAesKey());
		return configStorage;
	}

	@Bean
	@ConditionalOnMissingBean
	public WxMpService wxMpService(WxMpConfigStorage configStorage) {
//        WxMpService wxMpService = new me.chanjar.weixin.mp.api.impl.okhttp.WxMpServiceImpl();
//        WxMpService wxMpService = new me.chanjar.weixin.mp.api.impl.jodd.WxMpServiceImpl();
//        WxMpService wxMpService = new me.chanjar.weixin.mp.api.impl.apache.WxMpServiceImpl();
		WxMpService wxMpService = new me.chanjar.weixin.mp.api.impl.WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(configStorage);
		return wxMpService;
	}

	@Bean
	public WxMpMessageRouter router(WxMpService wxMpService) {
		final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);

		// 记录所有事件的日志 （异步执行）
		newRouter.rule().handler(this.logHandler).next();

		// 接收客服会话管理事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(WxMpEventConstants.CustomerService.KF_CREATE_SESSION)
				.handler(this.kfSessionHandler).end();
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(WxMpEventConstants.CustomerService.KF_CLOSE_SESSION)
				.handler(this.kfSessionHandler)
				.end();
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(WxMpEventConstants.CustomerService.KF_SWITCH_SESSION)
				.handler(this.kfSessionHandler).end();

		// 门店审核事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(WxMpEventConstants.POI_CHECK_NOTIFY)
				.handler(this.storeCheckNotifyHandler).end();

		// 自定义菜单事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(MenuButtonType.CLICK).handler(this.getMenuHandler()).end();

		// 点击菜单连接事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(MenuButtonType.VIEW).handler(this.nullHandler).end();

		// 关注事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(EventType.SUBSCRIBE).handler(this.getSubscribeHandler())
				.end();

		// 取消关注事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(EventType.UNSUBSCRIBE)
				.handler(this.getUnsubscribeHandler()).end();

		// 上报地理位置事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(EventType.LOCATION).handler(this.getLocationHandler())
				.end();

		// 接收地理位置消息
		newRouter.rule().async(false).msgType(XmlMsgType.LOCATION)
				.handler(this.getLocationHandler()).end();

		// 扫码事件
		newRouter.rule().async(false).msgType(XmlMsgType.EVENT)
				.event(EventType.SCAN).handler(this.getScanHandler()).end();

		// 默认
		newRouter.rule().async(false).handler(this.getMsgHandler()).end();

		return newRouter;
	}

	protected MenuHandler getMenuHandler() {
		return this.menuHandler;
	}

	protected SubscribeHandler getSubscribeHandler() {
		return this.subscribeHandler;
	}

	protected UnsubscribeHandler getUnsubscribeHandler() {
		return this.unsubscribeHandler;
	}

	protected AbstractHandler getLocationHandler() {
		return this.locationHandler;
	}

	protected MsgHandler getMsgHandler() {
		return this.msgHandler;
	}

	protected AbstractHandler getScanHandler() {
		return null;
	}
}
