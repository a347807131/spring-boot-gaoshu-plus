/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina;

import org.junit.Assert;
import org.junit.Test;
import top.catarina.base.utils.GenericsUtil;
import top.catarina.core.persist.entity.User;

import java.lang.reflect.Proxy;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-13 18:11
 */
public class GnericTest {
	@Test
	public void test() throws Exception {
		User user = new User();
		user.setNickname("88");
		GenericsUtil.changeValueOfField(user,"nickname","gogog");
		Assert.assertEquals(user.getNickname(),"gogog");
	}
	@Test
	public void tes2() throws NoSuchFieldException, IllegalAccessException {
		User user = new User();
		user.setGolds(100);
		GenericsUtil.changeValueOfField(user,"golds",101);
		Assert.assertEquals(user.getGolds(),101);
	}
	@Test
	public void proxy(){
	}

}
