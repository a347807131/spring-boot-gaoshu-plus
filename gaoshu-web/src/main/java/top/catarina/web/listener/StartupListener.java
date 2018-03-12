package top.catarina.web.listener;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Date;
import java.util.HashMap;

@Slf4j
@Component
@WebListener
public class StartupListener implements ServletContextListener {
	private final
	AppContext appContext;
	private final
	WxMpService mpService;

	@Autowired
	public StartupListener(AppContext appContext, WxMpService mpService) {
		this.appContext = appContext;
		this.mpService = mpService;
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		log.info("监听器启动。");
		/*
		 * 加载配置，后续完善。
		 */
		HashMap<String, String> map = new HashMap<>();

		map.put("authUrl", mpService.oauth2buildAuthorizationUrl("http://" + appContext.getDomain() + Consts.MP_OAUTH_CALLBACK_URI,
				WxConsts.OAuth2Scope.SNSAPI_USERINFO, String.valueOf(new Date().getTime())));
		map.put("notifyUrl", "http://" + appContext.getDomain() + Consts.PAY_NOTIFY_CALLBACK_URI);
		appContext.setConfig(map);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}
}
