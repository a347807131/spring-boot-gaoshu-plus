/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.catarina.base.lang.Consts;
import top.catarina.base.utils.R;
import top.catarina.core.persist.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-12 17:46
 */
@RequestMapping("/login")
@RestController
public class LoginController {
	@Autowired
	UserService userService;

	@GetMapping
	public R get(HttpSession session) {
		session.setAttribute(Consts.USER_ID, userService.get(1));
		return R.ok();
	}
}
