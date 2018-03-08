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
import top.catarina.core.persist.entity.Post;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 15:41
 */
public interface PostDao extends JpaRepository<Post,Long> {
	/**
	 * 查询指定用户
	 * @param authorId
	 * @param pageable
	 * @return
	 */
	Page<Post> findByAuthorId(long authorId, Pageable pageable);

	/**
	 * 通过用户id及访问权限查询
	 * @param authorId
	 * @param privacy
	 * @param pageable
	 * @return
	 */
	Page<Post> findByAuthorIdAndPrivacy(long authorId, int privacy, Pageable pageable);

	/**
	 * 用于post的列表查询
	 * @param privacy 权限
	 * @param pageable 分页
	 * @return page包装类
	 */
	Page<Post> findByPrivacy(int privacy,Pageable pageable);

	Page<Post> findByTag(String tag,Pageable pageable);

}
