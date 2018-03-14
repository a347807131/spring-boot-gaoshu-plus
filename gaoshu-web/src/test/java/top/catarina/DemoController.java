/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-12 14:23
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	UserService userService;
	@GetMapping("1")
	public String demo1(){
		return "demo1";
	}

	/**
	 * 获取一个user
	 */
	@GetMapping("2")
	public User demo2(){
		return userService.get(1);
	}
}
