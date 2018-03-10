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
import top.catarina.core.persist.dao.CollegeDao;
import top.catarina.core.persist.entity.College;
import top.catarina.core.persist.service.CollegeService;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:41
 */
@Service
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	CollegeDao collegeDao;
	@Override
	public List<College> getAll() {
		return collegeDao.findAll();
	}

	@Override
	public College get(String name) {
		Assert.notNull(name);
		return collegeDao.findByCollegeName(name);
	}

	@Override
	public Page<College> paging(Pageable pageable) {
		return collegeDao.findAll(pageable);
	}
}
