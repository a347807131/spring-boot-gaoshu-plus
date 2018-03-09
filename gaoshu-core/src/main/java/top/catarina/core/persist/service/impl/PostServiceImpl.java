/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import top.catarina.base.lang.Consts;
import top.catarina.base.lang.Enums;
import top.catarina.core.data.PostVo;
import top.catarina.core.persist.dao.PostAttributeDao;
import top.catarina.core.persist.dao.PostDao;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.service.PostService;

import java.util.ArrayList;
import java.util.List;

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
	public long post(Post post) {
		Assert.notNull(post);
		postDao.save(post);
		return post.getId();
	}

	@Override
	public Post get(long id) {
		Post one = postDao.getOne(id);
		Assert.notNull(one);
		return one;
	}

	@Override
	public long update(Post post) {
		return 0;
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
	public Page<PostVo> paging(Pageable pageable) {
		Page<Post> page = postDao.findAll(pageable);
		return toVoPage(page,pageable);
	}

	@Override
	public Page<PostVo> pagingByAuthorId(Pageable pageable, long userId, int privacy) {
		Page<Post> postPage = postDao.findByAuthorIdAndPrivacy(userId, privacy, pageable);
		return toVoPage(postPage,pageable);
	}

	@Override
	public Page<PostVo> pagingByAuthorId(Pageable pageable, long userId) {
		Page<Post> posts = postDao.findByAuthorIdAndPrivacy(userId, Enums.Privacy.OPEN.getIndex(), pageable);
		return toVoPage(posts,pageable);
	}

	@Override
	public void search(String q, Pageable pageable) {

	}

	@Override
	public Page<PostVo> searchByTag(String tag, Pageable pageable) {
		Page<Post> posts = postDao.findByTag(tag, pageable);
		return toVoPage(posts,pageable);
	}
	/**
	 * 将原始的包装有entity的page复制为包装为Post的page
	 * @return
	 */
	private Page<PostVo> toVoPage(Page<Post> page,Pageable pageable){
		List<Post> pos = page.getContent();
		ArrayList<PostVo> vos = new ArrayList<>();
		for (Post po:pos) {
			PostVo vo = new PostVo();
			//复制除了attribute以外的属性
			BeanUtils.copyProperties(po,vo,"attribute");
		}
		Page<PostVo> ret = new PageImpl<PostVo>(vos, pageable,page.getSize());
		return ret;
	}
}
