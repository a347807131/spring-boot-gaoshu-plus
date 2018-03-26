/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import top.catarina.ApplicationTest;
import top.catarina.base.context.AppContext;
import top.catarina.base.upload.FileRepo;
import top.catarina.base.utils.GenericsUtil;
import top.catarina.core.persist.entity.*;
import top.catarina.core.persist.service.*;

import javax.transaction.Transactional;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-11 14:38
 */
public class ServiceTest extends ApplicationTest {
	@Autowired
	PostService postService;
	@Autowired
	UserService userService;
	@Autowired
	CollegeService collegeService;
	@Autowired
	CommentService commentService;
	@Autowired
	FileRepo fileRepo;
	@Autowired
	AppContext appContext;
	@Autowired
	NotifyService notifyService;

	@Test
	public void insertUser() {
		College college = collegeService.get("北京邮电大学");
		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setNickname("Civin");
			user.setCollege(college);
			userService.add(user);
		}

	}

	/**
	 * 发布推送
	 */
	@Override
	@Test
	//@Transactional
	public void test() throws Exception {
		String path= Objects.requireNonNull(getClass().getClassLoader().getResource("dragen.gif")).getPath();
		File temp = new File(path);
		User user = userService.get(1);
		for (int i = 0; i < 100; i++) {
			Post post = new Post();
			post.setTitle("测试");
			post.setTag("测试");
			post.setAuthor(user);
			Attach attach = new Attach();
			List<Attach> attaches = new ArrayList<>();

			int[] size = fileRepo.imageSize(temp.getPath());
			attach.setWidth(size[0]);
			attach.setHeight(size[1]);
			String pathAndFileName = fileRepo.storeAndScale(temp);
			attach.setOriginal(appContext.getOrigDir()+pathAndFileName);
			attach.setPreview(appContext.getThumbsDir()+pathAndFileName);
			attaches.add(attach);
			post.setAttaches(attaches);

			PostAttribute attribute = new PostAttribute();
			attribute.setPost(post);
			postService.post(attribute);
		}

	}

	/**
	 * 测试发表评论
	 */
	@Test
	public void testComment() throws Exception {
		User user = userService.get(1);

		for (int i = 0; i < 100; i++) {
			Comment comment = new Comment();
			comment.setAuthor(user);
			comment.setContent("测试");

			commentService.post(comment,i/2+1);
		}
	}
	@Test
	//@Transactional
	public void testAttach() throws Exception {
		String path= Objects.requireNonNull(getClass().getClassLoader().getResource("dragen.gif")).getPath();
		File temp = new File(path);
		User user = userService.get(1);
		for (int i = 0; i < 50; i++) {
			Comment comment = new Comment();
			comment.setAuthor(user);
			comment.setContent("测试");

			Attach attach = new Attach();
			List<Attach> attaches = new ArrayList<>();

			int[] size = fileRepo.imageSize(temp.getPath());
			attach.setWidth(size[0]);
			attach.setHeight(size[1]);
			String pathAndFileName = fileRepo.storeAndScale(temp);
			attach.setOriginal(appContext.getOrigDir()+pathAndFileName);
			attach.setPreview(appContext.getThumbsDir()+pathAndFileName);
			attaches.add(attach);

			comment.setAttachs(attaches);
			commentService.post(comment,i+1);
		}
	}

	@Test
	public void notifies() throws Exception {
		for (int i = 0; i < 50; i++) {
			Notify notify = new Notify();
			notify.setFromId(1);
			notify.setOwnId(1);
			notify.setPostId(i+2);
			notifyService.send(notify);
		}
	}
}
