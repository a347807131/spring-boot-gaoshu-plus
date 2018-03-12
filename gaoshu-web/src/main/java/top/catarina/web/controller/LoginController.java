/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.catarina.base.lang.Consts;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 23:47
 */
@RequestMapping("/longin")
public class LoginController {
	@GetMapping
	public void get(HttpServletRequest request,HttpServletResponse response){

	}
	private void login(HttpSession session, HttpServletResponse response) {
		session.setAttribute(Consts.USER_ID, 2L);
		// 设置登录cookie
		Cookie cookie = new Cookie("SESSIONID", session.getId());
		cookie.setPath("/");
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
	}
}
