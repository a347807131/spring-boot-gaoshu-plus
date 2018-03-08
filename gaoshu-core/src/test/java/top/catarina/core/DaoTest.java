/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catarina.ApplicationTest;
import top.catarina.core.persist.dao.AttachDao;
import top.catarina.core.persist.dao.CommentDao;
import top.catarina.core.persist.dao.UserDao;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.entity.Comment;
import top.catarina.core.persist.entity.User;

import javax.transaction.Transactional;
import java.util.LinkedList;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 22:42
 */
@Slf4j
public class DaoTest extends ApplicationTest {
	@Autowired
	UserDao userDao;
	@Autowired
	CommentDao commentDao;
	@Autowired
	AttachDao attachDao;
	@Override
	public void test() {
		User user = new User();
		user.setMobile("13716999059");
		userDao.save(user);
		System.out.println(user.getId());
	}
	@Test
	@Transactional
	public void testCascate(){
		//添加
		Comment comment = new Comment();
		comment.setContent("测试");
		LinkedList<Attach> list = new LinkedList<>();
		Attach attach = new Attach();
		attach.setHeight(10);
		list.add(attach);
		comment.setAttachs(list);
		commentDao.save(comment);

		long commentId = comment.getId();
		long attachId = attach.getId();
		Assert.assertTrue(attachDao.exists(attach.getId()));

		//删除
		commentDao.delete(comment);
		Assert.assertTrue(!attachDao.exists(attachId));
	}
}
