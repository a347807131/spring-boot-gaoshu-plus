/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catarina.Application;
import top.catarina.ApplicationTest;
import top.catarina.core.persist.service.UserService;

/**
 * @author Civin
 * 创建时间：2018-03-22 20:08
 */
public class MethodTest extends ApplicationTest {

	@Autowired
	UserService userService;
	@Override
	@Test
	public void test() throws Exception {
		userService.changeSingleAttr("nickname","civin1",1);
	}
}
