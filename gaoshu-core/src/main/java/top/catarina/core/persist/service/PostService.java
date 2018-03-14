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
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.entity.PostAttribute;

import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:25
 */
public interface PostService {
	/**
	 * 发布文章
	 *
	 * @param post 实体类
	 */
	long post(PostAttribute post);

	/**
	 * 文章详情
	 *
	 * @param id 主键
	 * @return 详情属性
	 */
	PostAttribute get(long id);

	Post getPost(long id);


	/**
	 * 更新文章方法 应该为只可更新部分属性 后续完善
	 *
	 * @param post 实体
	 */
	long update(Post post/*long id, String title,String tag,String context*/);

	/**
	 * 删除
	 *
	 * @param id 主键
	 */
	void delete(long id);

	/**
	 * 带作者验证的删除 - 验证是否属于自己的文章
	 *
	 * @param id       主键
	 * @param authorId 用户id
	 */
	void delete(long id, long authorId);

	/**
	 * 自增浏览数
	 */
	int identityViews(long id);

	/**
	 * 自增评论数
	 *
	 */
	int identityComments(long id);

	/**
	 * 锁定推送
	 */
	void lock(long pid);

	/**
	 * 因违规被拉黑，带完善
	 */
	void block(long pid);

	/**
	 * 更改post的状态
	 *
	 * @param postId 主题id
	 * @param status 所要更改的状态
	 */
	void changeStatus(long postId, int status);

	/**
	 * 分页查询所有文章
	 */
	Page<Post> paging(Pageable pageable);

	/**
	 * 查询自己未处理的信心
	 */
	List<Post> pagingUnread(long uid);

	/**
	 * 查询个人发布文章
	 *
	 * @param privacy  权限
	 */
	Page<Post> pagingByAuthorId(Pageable pageable, long userId, int privacy);

	/**
	 * 用于用户查询自己的文章
	 *
	 * @param pageable 分页
	 * @param userId   用户id
	 * @return 包装类
	 */
	Page<Post> pagingByAuthorId(Pageable pageable, long userId);

	/**
	 * 根据关键字搜索
	 *
	 * @param q 关键字
	 */
	void search(String q, Pageable pageable);

	/**
	 * 搜索 Tag
	 *  @param tag      标签
	 * @param pageable 分页配置
	 */
	Page<Post> searchByTag(String tag, Pageable pageable);


}
