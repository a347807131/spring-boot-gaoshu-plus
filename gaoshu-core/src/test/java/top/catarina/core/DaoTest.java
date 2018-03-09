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
import top.catarina.core.persist.dao.*;
import top.catarina.core.persist.entity.*;

import javax.transaction.Transactional;
import java.util.LinkedList;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 22:42
 */
@Slf4j
@Transactional
public class DaoTest extends ApplicationTest {
	@Autowired
	UserDao userDao;
	@Autowired
	CommentDao commentDao;
	@Autowired
	AttachDao attachDao;
	@Autowired
	PostDao postDao;
	@Autowired
	NotifyDao notifyDao;

	@Override
	public void test() {
		User user = new User();
		user.setMobile("13716999059");
		userDao.save(user);
		System.out.println(user.getId());
	}

	@Test
	public void testCascades() {
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
		Assert.assertTrue(!commentDao.exists(commentId));
	}

	@Test
	public void testCascades2() {
		//添加
		Comment comment = new Comment();
		comment.setContent("测试");
		LinkedList<Attach> list = new LinkedList<>();
		Attach attach = new Attach();
		attach.setHeight(10);
		list.add(attach);
		comment.setAttachs(list);
		commentDao.save(comment);

		Attach attach1 = new Attach();
		attach1.setHeight(11);
		comment.getAttachs().add(attach1);
		Assert.assertTrue(attachDao.count() == 2);
		Assert.assertTrue(attach1.getId() != 0);

	}

	@Test
	public void testPostDao() throws InterruptedException {
		Post post = new Post();
		post.setTitle("测试");
		postDao.save(post);
		log.info("第一次储存后:"
				+ "创建时间" + post.getCreated() + "--" + "最近更新时间" + post.getLastUpdate());
		Assert.assertNotNull(post.getCreated() == post.getLastUpdate());
		Thread.sleep(3000);
		post.setTag("高数");

		post = postDao.findOne(post.getId());
		log.info("更新后:"
				+ "创建时间" + post.getCreated() + "--" + "最近更新时间" + post.getLastUpdate());
		Assert.assertNotNull(post.getCreated() != post.getLastUpdate());
	}

	@Test
	public void testPostDao2() throws InterruptedException {
		Post post = new Post();
		post.setViews(1);
		post.setTag("测试");
		Post post1 = postDao.save(post);
		post1.setViews(2);

		Assert.assertTrue(!(post.getId()==0));
		Assert.assertTrue(post1.getViews() == postDao.getOne(post.getId()).getViews());
	}

	@Test
	public void testNotifyDao() {
		Notify notify = new Notify();
		notify.setOwnId(1);
		notifyDao.save(notify);
		int i = notifyDao.countByOwnId(1);
		System.out.println(i);
	}
}
