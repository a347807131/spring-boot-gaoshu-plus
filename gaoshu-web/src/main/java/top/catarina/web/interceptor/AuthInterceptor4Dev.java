package top.catarina.web.interceptor;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class AuthInterceptor4Dev extends HandlerInterceptorAdapter {

	private final
	UserService userService;

	@Autowired
	public AuthInterceptor4Dev(UserService userService) {
		this.userService = userService;
	}


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

}
