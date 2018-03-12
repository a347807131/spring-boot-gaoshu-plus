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
import top.catarina.base.lang.Consts;
import top.catarina.base.lang.Enums;
import top.catarina.core.persist.dao.PostAttributeDao;
import top.catarina.core.persist.dao.PostDao;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.entity.PostAttribute;
import top.catarina.core.persist.service.PostService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 16:38
 * @apiNote 所有添加删除由attributeDao操作
 */
@Service
public class PostServiceImpl implements PostService {
	@Autowired
	PostDao postDao;
	@Autowired
	PostAttributeDao attributeDao;

	@Override
	public long post(PostAttribute post) {
		Assert.notNull(post);
		return attributeDao.save(post).getId();
	}

	@Override
	public PostAttribute get(long id) {
		return attributeDao.getOne(id);
	}

	@Override
	public Post getPost(long id) {
		return null;
	}

	/**
	 * 暂时不提供修改的功能
	 * @param post 实体
	 */
	@Override
	public long update(Post post) {
		return postDao.save(post).getId();
	}

	@Override
	public void delete(long id) {
		attributeDao.delete(id);
	}

	@Override
	public void delete(long id, long authorId) {
		Post post = postDao.getOne(id);
		Assert.isTrue(authorId==post.getAuthor().getId());
		attributeDao.delete(id);
	}

	@Override
	public int identityViews(long id) {
		Post one = postDao.getOne(id);
		Assert.notNull(one);
		one.setViews(one.getViews()+ Consts.IDENTITY_STEP);
		return one.getViews();
	}

	@Override
	public int identityComments(long id) {
		Post one = postDao.getOne(id);
		Assert.notNull(one);
		one.setReplys(one.getReplys()+ Consts.IDENTITY_STEP);
		return one.getReplys();
	}

	@Override
	public void lock(long id) {
		Post one = postDao.getOne(id);
		Assert.notNull(one);
		one.setStatus(Enums.StatusPost.RESOLVED.getIndex());
	}

	@Override
	public void block(long pid) {
		changeStatus(pid, Enums.StatusPost.RESOLVED.getIndex());
	}

	@Override
	public void changeStatus(long id, int status) {
		Post one = postDao.getOne(id);
		Assert.notNull(one);
		one.setStatus(status);

	}

	@Override
	public Page<Post> paging(Pageable pageable) {
		return postDao.findAll(pageable);
	}

	@Override
	public Page<Post> pagingByAuthorId(Pageable pageable, long userId, int privacy) {
		return postDao.findByAuthorIdAndPrivacy(userId, privacy, pageable);
	}

	@Override
	public Page<Post> pagingByAuthorId(Pageable pageable, long userId) {
		return postDao.findByAuthorIdAndPrivacy(userId, Enums.Privacy.OPEN.getIndex(), pageable);
	}

	@Override
	public void search(String q, Pageable pageable) {

	}

	@Override
	public Page<Post> searchByTag(String tag, Pageable pageable) {
		return postDao.findByTag(tag, pageable);
	}
}
