/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service;

import top.catarina.core.persist.entity.Notify;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 18:30
 */
public interface NotifyService {
	/**
	 * 用户查询自己的通知
	 *
	 * @param ownId 用户id
	 */
	List<Notify> findByOwnId(long ownId);

	/**
	 * 发送通知
	 *
	 * @param notify 实体类
	 * @return 主键
	 */
	long send(Notify notify) throws Exception;

	/**
	 * 未读消息数量
	 *
	 * @param ownId
	 * @return
	 */
	int unread4Me(long ownId);

	/**
	 * 标记为已读
	 *
	 * @param ownId
	 */
	void readed4Me(long ownId);

}
