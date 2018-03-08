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
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import top.catarina.core.persist.dao.CommentDao;
import top.catarina.core.persist.entity.Comment;
import top.catarina.core.persist.service.CommentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:50
 */
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentDao commentDao;
	@Override
	public Map<Long, Comment> findByIds(Set<Long> ids) {
		Assert.notNull(ids);
		List<Comment> list = commentDao.findAll(ids);
		HashMap<Long, Comment> map = new HashMap<>();
		for (Comment comment:list) {
			map.put(comment.getId(),comment);
		}
		return map;
	}

	@Override
	public long post(Comment comment) {
		Assert.notNull(comment);
		Comment re = commentDao.save(comment);
		return re.getId();
	}

	@Override
	public void delete(List<Long> ids) {
		Assert.notNull(ids);
		commentDao.delete(commentDao.findAll(ids));
	}

	@Override
	public void delete(long id, long uId) {
		Comment one = commentDao.getOne(id);
		Assert.isTrue(uId==one.getAuthor().getId(),"非本人操作。");
		commentDao.delete(id);
	}
}
