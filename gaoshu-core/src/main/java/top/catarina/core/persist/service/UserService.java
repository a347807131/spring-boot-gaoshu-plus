/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service;

import top.catarina.core.persist.entity.User;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 21:20
 */
public interface UserService {
	/**
	 * 查询单个用户
	 * @param id
	 * @return
	 */
	User get(long id);

	/**
	 * 添加
	 */
	long add(User user);

	/**
	 * 通过openid查询
	 */
	User get(String openId);

	/**
	 * 锁定用户
	 * @param id
	 */
	void lock(long id);

	/**
	 * 修改用户状态
	 * @param id
	 * @param status
	 */
	void updateStatus(long id, int status);

	List<User> getAll();

	/**
	 * 自增post数
	 * @param userId
	 * @return
	 */
	int identityPosts(long userId);

	/**
	 * 更改金币数量
	 */
	int changeGolds(long userId,int gold);

}
