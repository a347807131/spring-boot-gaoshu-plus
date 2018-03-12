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
import top.catarina.base.lang.Consts;
import top.catarina.base.lang.Enums.*;
import top.catarina.core.persist.dao.UserDao;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 22:33
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Override
	public User get(long id) {
		return userDao.getOne(id);
	}

	@Override
	public long add(User user) {
		Assert.notNull(user,"user实体类为空");
		return userDao.save(user).getId();
	}

	@Override
	public User get(String openId) {
		return userDao.getByOpenId(openId);
	}


	@Override
	public void lock(long id) {
		updateStatus(id, StatusUser.LOCKED.getIndex());
	}

	@Override
	public void updateStatus(long id, int status) {
		User one = userDao.getOne(id);
		one.setStatus(status);
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public int identityPosts(long id) {
		User one = userDao.getOne(id);
		one.setPosts(one.getPosts()+ Consts.IDENTITY_STEP);
		return one.getPosts();
	}


	@Override
	public int changeGolds(long userId, int golds) {
		User po = userDao.getOne(userId);
		Assert.isTrue(po.getGolds()>=golds);
		po.setGolds(po.getPosts()-golds);
		return po.getGolds();
	}
}
