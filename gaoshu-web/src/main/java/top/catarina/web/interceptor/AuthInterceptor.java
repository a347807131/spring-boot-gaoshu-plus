package top.catarina.web.interceptor;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 登录拦截器
 * 用于检查访问请求是否登录
 * @author Civin
 */
@Slf4j
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {
	private final
	AppContext appContext;

	List<String> excludedUrls=new LinkedList<>();

	@Autowired
	public AuthInterceptor(WxMpService mpService, AppContext appContext) {
		this.appContext = appContext;
	}


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String requestUri = request.getRequestURI();
		String authUrl=appContext.getConfig().get("authUrl");
		// 是否需要拦截
		for (String s : excludedUrls) {
			if (requestUri.endsWith(s)) {
				return true;
			}
		}
		String sessionId = null;
		// 是否有cookie
		Cookie[] cookies = request.getCookies();
		if (ArrayUtils.isEmpty(cookies)) {
			log.info("拦截到未授权的请求。");
			//转发到登陆页面
			response.sendRedirect(authUrl);
			return false;
		} else {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("SESSIONID")) {
					sessionId = cookie.getValue();
					break;
				}
			}
		}
		// cookie中是否有loginToken
		if (StringUtils.isEmpty(sessionId) || !request.getSession().getId().equals(sessionId)) {
			log.info("拦截到未授权的请求。");
			//转发到登陆页面
			response.sendRedirect(authUrl);
			return false;
		}
		return true;
	}
}
