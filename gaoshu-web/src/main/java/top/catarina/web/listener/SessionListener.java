/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.catarina.base.lang.Consts;
import top.catarina.core.persist.service.UserService;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-16 23:39
 */
@Slf4j
@Component
@WebListener
public class SessionListener implements HttpSessionListener {
	private final
	UserService userService;

	@Autowired
	public SessionListener(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		log.debug("session创建.");
		HttpSession session = httpSessionEvent.getSession();
		session.setAttribute(Consts.USER_ID,userService.get(101));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

	}
}
