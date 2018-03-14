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
import top.catarina.base.lang.Enums;
import top.catarina.core.persist.dao.NotifyDao;
import top.catarina.core.persist.entity.Notify;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.service.NotifyService;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.persist.service.UserService;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 18:31
 */
@Service
public class NotifyServiceImpl implements NotifyService {

	@Autowired
	NotifyDao notifyDao;
	@Autowired
	UserService userService;
	@Autowired
	PostService postService;

	@Override
	public List<Notify> findByOwnId(long ownId) {
		List<Notify> list = notifyDao.findByOwnId(ownId);
		return list;
	}

	@Override
	public long send(Notify notify) throws Exception {
		if (!(notify == null || notify.getOwnId() <= 0 || notify.getFromId() <= 0)) {
			return notifyDao.save(notify).getId();
		}
		throw new Exception("通知保存异常");
	}

	@Override
	public long send(long uid, long pid) throws Exception {
		Notify notify = new Notify();
		notify.setFromId(uid);
		notify.setEvent(Enums.EnumLog.REPLY.ordinal());
		notify.setPostId(pid);
		long ownId = postService.getPost(pid).getAuthor().getId();
		notify.setOwnId(ownId);
		return send(notify);
	}

	@Override
	public int unread4Me(long ownId) {
		return notifyDao.countByOwnId(ownId);
	}

	@Override
	public void readed4Me(long ownId) {
		List<Notify> list = notifyDao.findByOwnId(ownId);
		for (Notify notify : list) {
			notify.setStatus(Enums.StatusNotify.READED.getIndex());
		}
	}
}
