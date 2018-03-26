/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import top.catarina.core.persist.entity.Comment;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 10:48
 */
public interface CommentDao extends JpaRepository<Comment,Long>{
	/**
	 * 通过用户id进行分页查询查找
	 */
	Page<Comment> findByAuthorId(long uid,Pageable pageable);
}
