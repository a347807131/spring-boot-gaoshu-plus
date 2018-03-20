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
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-16 11:35
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController{

	@RequestMapping("1")
	public String d1(){
		return "国内各种审核，这他妈操蛋。";
	}

	@GetMapping(value = "2")
	public String address() throws Exception {
		return getIpAddr(getRequest());
	}

}
