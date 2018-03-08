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
import top.catarina.base.context.AppContext;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 20:49
 */
public class FileRepoTest  extends ApplicationTest {

	@Autowired
	AppContext appContext;

	@Override
	public void test() {
		System.out.println(appContext.getRoot());
	}
}
