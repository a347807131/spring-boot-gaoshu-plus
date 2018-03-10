/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import top.catarina.core.data.UserForm;
import top.catarina.core.persist.entity.User;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 14:40
 */
public class BeanUtilsTest {
	@Test
	public void test1(){
		User user = new User();
		user.setPosts(100);
		UserForm form = new UserForm();
		form.setCollegeName("gg");
		form.setNickname("21320");
		BeanUtils.copyProperties(form,user);
		Assert.assertTrue(user.getPosts()!=0);
	}
}
