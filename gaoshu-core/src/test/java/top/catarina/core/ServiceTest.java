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
import top.catarina.ApplicationTest;
import top.catarina.base.context.AppContext;
import top.catarina.base.upload.FileRepo;
import top.catarina.core.persist.entity.*;
import top.catarina.core.persist.service.CollegeService;
import top.catarina.core.persist.service.CommentService;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.persist.service.UserService;

import javax.transaction.Transactional;
import java.io.File;
import java.util.ArrayList;

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
	@Transactional
	public void test() throws Exception {
		User user = userService.get(1);
		for (int i = 0; i < 100; i++) {
			Post post = new Post();
			post.setTitle("测试");
			post.setTag("测试");
			post.setAuthor(user);
			PostAttribute attribute = new PostAttribute();
			attribute.setPost(post);
			postService.post(attribute);
		}

	}

	/**
	 * 测试发表评论
	 */
	@Test
	@Transactional
	public void testComment(){
		User user = userService.get(1);
		for (int i = 0; i < 100; i++) {
			Comment comment = new Comment();
			comment.setAuthor(user);
			comment.setContent("测试");
			commentService.post(comment,i/2+2);
		}
	}
	@Test
	//@Transactional
	public void testAttach() throws Exception {
		String path=getClass().getClassLoader().getResource("dragen.gif").getPath();
		File temp = new File(path);
		User user = userService.get(1);
		for (int i = 0; i < 50; i++) {
			Comment comment = new Comment();
			comment.setAuthor(user);
			comment.setContent("测试");

			Attach attach = new Attach();
			ArrayList<Attach> attaches = new ArrayList<>();
			int[] size = fileRepo.imageSize(temp.getPath());
			attach.setWidth(size[0]);
			attach.setHeight(size[1]);
			String pathAndFileName = fileRepo.storeAndScale(temp);
			attach.setOriginal(appContext.getOrigDir()+pathAndFileName);
			attach.setPreview(appContext.getThumbsDir()+pathAndFileName);
			attaches.add(attach);

			comment.setAttachs(attaches);
			commentService.post(comment,i+2);
		}
	}
}
