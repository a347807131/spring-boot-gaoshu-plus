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
import top.catarina.core.persist.entity.Comment;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:43
 */
public interface CommentService {
	/**
	 * 用户查询自己的评论
	 */
	Page<Comment> paging(long ownId, Pageable pageable);

	/**
	 * 通过ids集合查询
	 *
	 * @param ids 集合
	 * @return 封装信息的map
	 */
	Map<Long, Comment> findByIds(Set<Long> ids);

	/**
	 * 发表评论
	 *
	 * @param comment 实体
	 * @return 主键值
	 */
	long post(Comment comment,long pid);

	/**
	 * 批量删除
	 *
	 * @param ids 主键
	 */
	void delete(List<Long> ids);

	/**
	 * 带作者验证的删除 必须由评论者本人才能进行删除
	 *
	 * @param id  comment的id
	 * @param uId 用户id
	 */
	void delete(long id, long uId);
}
