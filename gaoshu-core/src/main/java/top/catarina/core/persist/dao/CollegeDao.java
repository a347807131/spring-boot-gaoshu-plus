/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.catarina.core.persist.entity.College;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:37
 */
public interface CollegeDao extends JpaRepository<College,Long>{
	College findByCollegeName(String string);
}
