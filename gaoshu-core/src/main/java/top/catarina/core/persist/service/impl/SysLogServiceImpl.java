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
import top.catarina.core.persist.dao.SysLogDao;
import top.catarina.core.persist.entity.SysLog;
import top.catarina.core.persist.service.SysLogService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 19:12
 */
@Service
public class SysLogServiceImpl implements SysLogService {
	@Autowired
	SysLogDao sysLogDao;

	@Override
	public long insert(SysLog log) {
		Assert.notNull(log);
		return sysLogDao.save(log).getId();
	}
}
