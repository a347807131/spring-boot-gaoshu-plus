/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import top.catarina.core.persist.dao.CommentDao;
import top.catarina.core.persist.dao.PostAttributeDao;
import top.catarina.core.persist.dao.PostDao;
import top.catarina.core.persist.entity.Comment;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.entity.PostAttribute;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CommentService;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.persist.service.UserService;

import java.util.*;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:50
 */
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentDao commentDao;
	@Autowired
	UserService userService;
	@Autowired
	PostDao postDao;
	@Autowired
	PostService postService;

	@Override
	public Page<Comment> paging(long ownId, Pageable pageable) {
		User user = userService.get(ownId);
		Assert.notNull(user, "用户不存在.");
		return null;
	}

	@Override
	public Map<Long, Comment> findByIds(Set<Long> ids) {
		Assert.notNull(ids);
		List<Comment> list = commentDao.findAll(ids);
		HashMap<Long, Comment> map = new HashMap<>();
		for (Comment comment : list) {
			map.put(comment.getId(), comment);
		}
		return map;
	}

	/**
	 * 发表comment不由commentdao实现，先用postDao查找后添加到对应的评论列表
	 * @param comment 实体
	 * @param pid post的id
	 * @return 生成的主键
	 */
	@Override
	public long post(Comment comment, long pid) {
		Assert.notNull(comment);
		Post post = postDao.getOne(pid);
		Assert.notNull(post, "不存在相关推送。");
		List<Comment> comments = post.getAttribute().getComments();
		if (comments == null) {
			ArrayList<Comment> list = new ArrayList<>();
			list.add(comment);
			post.getAttribute().setComments(list);
			postDao.save(post);
		} else {
			comments.add(comment);
			postDao.save(post);
		}
		//自增评论数 浏览数
		postService.identityComments(pid);
		postService.identityViews(pid);
		return comment.getId();
	}

	@Override
	public void delete(List<Long> ids) {
		Assert.notNull(ids);
		commentDao.delete(commentDao.findAll(ids));
	}

	@Override
	public void delete(long id, long uId) {
		Comment one = commentDao.getOne(id);
		Assert.isTrue(uId == one.getAuthor().getId(), "非本人操作。");
		commentDao.delete(id);
	}
}
