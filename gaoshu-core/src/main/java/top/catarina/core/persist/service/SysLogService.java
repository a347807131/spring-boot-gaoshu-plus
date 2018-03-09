/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service;

import top.catarina.core.persist.entity.SysLog; /**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 19:12
 */
public interface SysLogService {
	/**
	 *
	 * @param log 实体
	 * @return 主键
	 */
	long insert(SysLog log);
}
