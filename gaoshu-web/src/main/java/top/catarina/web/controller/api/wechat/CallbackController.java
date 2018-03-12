package top.catarina.web.controller.api.wechat;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * oauth第三方回调
 */
@Slf4j
@Controller
@RequestMapping(Consts.MP_OAUTH_CALLBACK_URI)
public class CallbackController {

	@Autowired
	WxMpService mpService;
	@Autowired
	UserService userService;
	@Autowired
	AppContext appContext;

	/**
	 * 供前端获取微信auth认证的链接地址
	 */
	@ResponseBody
	@GetMapping("url")
	public String authUrl(){
		return appContext.getConfig().get("authUrl");
	}

	/**
	 * 回调接口
	 * @param code 用于换取access_token的凭证
	 */
	@ResponseBody
	@GetMapping
	public User callback(@RequestParam String code,
	                     HttpSession session,
	                     HttpServletResponse response) throws WxErrorException {
		log.debug("进行微信auth认证回调.");

		WxMpOAuth2AccessToken accessToken = mpService.oauth2getAccessToken(code);
		//判断数据库中是否存在该用户，如果不存在则进行获取身份信息并添加到数据库中
		User user = userService.get(accessToken.getOpenId());
		if (user==null){
			WxMpUser mpUser = mpService.oauth2getUserInfo(accessToken, null);
			user = new User();
			BeanUtils.copyProperties(mpUser,user);
			userService.add(user);
		}
		/*
		 * 因为hibernate的实际思想，
		 * 所以sessin(request)中不能直接存方受sessionhibernate管控的实体类
		 * 解决方案，new 一个不受管控的实体类，并将信息复制
		 */
		User userInSession = new User();
		BeanUtils.copyProperties(user,userInSession);
		//保存相关信息到session cookie中
		login(session, response, userInSession);
		return user;
	}

	/**
	 * 对当前用户进行登陆业务逻辑处理
	 *
	 * @param session  会话
	 * @param response 响应
	 * @param user     当前用户信息类
	 */
	private void login(HttpSession session, HttpServletResponse response, User user) {
		session.setAttribute(Consts.USER_ID, user);
		// 设置登录cookie
		Cookie cookie = new Cookie("SESSIONID", session.getId());
		cookie.setPath("/");
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
	}
}
