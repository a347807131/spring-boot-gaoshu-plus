/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.catarina.core.persist.entity.College;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:38
 */
public interface CollegeService {
	/**
	 * 查询库中所有记录
	 * @return 列表
	 */
	List<College> getAll();

	College get(String name);
	/**
	 * 分页查询
	 * @param pageable 分页对象
	 * @return 分页
	 */
	Page<College> paging(Pageable pageable);

}
