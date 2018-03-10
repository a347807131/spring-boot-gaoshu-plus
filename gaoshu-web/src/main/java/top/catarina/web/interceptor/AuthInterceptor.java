package top.catarina.web.interceptor;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
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
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Autowired
	WxMpService mpService;

	String authUrl="";/*mpService.oauth2buildAuthorizationUrl("http://"+Consts.MP_OAUTH_PORTAL + "/callback",
			WxConsts.OAuth2Scope.SNSAPI_USERINFO, String.valueOf(new Date().getTime()));
*/
	List<String> excludedUrls=new LinkedList<>();


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String requestUri = request.getRequestURI();

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
			//转发到登陆页面
			response.sendRedirect(authUrl);
			return false;
		} else {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("JSESSIONID")) {
					sessionId = cookie.getValue();
					break;
				}
			}
		}
		// cookie中是否有loginToken
		if (StringUtils.isEmpty(sessionId) || !request.getSession().getId().equals(sessionId)) {
			//转发到登陆页面
			response.sendRedirect(authUrl);
			return false;
		}
		return true;
	}
}
