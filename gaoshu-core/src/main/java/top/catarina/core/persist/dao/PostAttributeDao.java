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
import top.catarina.core.persist.entity.PostAttribute;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 16:49
 */
public interface PostAttributeDao extends JpaRepository<PostAttribute,Long>{
}
