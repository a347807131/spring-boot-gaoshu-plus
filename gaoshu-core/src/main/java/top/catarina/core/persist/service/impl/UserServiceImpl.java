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
import top.catarina.base.lang.Enums.StatusUser;
import top.catarina.core.persist.dao.UserDao;
import top.catarina.core.persist.entity.College;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CollegeService;
import top.catarina.core.persist.service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
	@Autowired
	CollegeService collegeService;

	/**
	 * 可供用户更改的属性
	 */
	private static final String[] attrs={
			"collegeName","moblie","gender","email",
			"nickname","headImgUrl","city","province",
			"country"};
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
		Assert.isTrue(po.getGolds()+golds>=0);
		po.setGolds(po.getPosts()+golds);
		return po.getGolds();
	}

	@Override
	public void changeSingleAttr(String attr, Object value,long uid) throws Exception {

		for (String attOri:attrs) {
			if(attOri.equals(attOri))
				break;
			throw new RuntimeException("该属性不可被用户更改.");
		}
		User user = userDao.getOne(uid);
		Assert.notNull(user);
		if(!"collegeName".equals(attr)) {
			Class<User> clazz = User.class;
			Field field = clazz.getDeclaredField(attr);
			Class<?> type = field.getType();
			String methodName = "set" + String.valueOf(attr.charAt(0)).toUpperCase() + attr.substring(1);
			Method method = clazz.getMethod(methodName, type);
			method.invoke(user, type.cast(value));
			userDao.save(user);
			return;
		}
		College college = collegeService.get(String.valueOf(value));
		Assert.notNull(college);
		user.setCollege(college);
	}

	@Override
	public int indentityEarnedGolds(long uid, int golds) {
		User po = userDao.getOne(uid);
		Assert.isTrue(golds>=0);
		po.setEarnedGolds(po.getEarnedGolds()+golds);
		return po.getGolds();
	}
}
