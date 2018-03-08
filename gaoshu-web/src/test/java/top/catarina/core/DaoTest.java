/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core;

import org.springframework.beans.factory.annotation.Autowired;
import top.catarina.ApplicationTest;
import top.catarina.core.persist.dao.UserDao;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 22:28
 */
public class DaoTest extends ApplicationTest {
	@Autowired
	UserDao userDao;
	@Override
	public void test() {

	}
}
