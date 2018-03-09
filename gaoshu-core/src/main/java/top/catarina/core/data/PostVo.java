/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import top.catarina.core.persist.entity.PostAttribute;
import top.catarina.core.persist.entity.User;

import java.util.Date;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-09 11:14
 * 作为列表使用，不加载postAttribut
 */
public class PostVo {
	private long id;

	/**
	 * 标题
	 */
	private String title;
	/**
	 * 访问权限
	 */
	@JsonIgnore
	private int privacy;
	/**
	 * 悬赏金币数量
	 */
	private int reward;

	/**
	 * 回复数
	 */
	private int replys;

	/**
	 * 文章状态
	 */
	private int status;


	/**
	 * 标签，多个都好隔开
	 */
	private String tag;

	/**
	 * 浏览数
	 */
	private int views;

	private Date created;

	@JsonProperty("last_update")
	private Date lastUpdate;
	/**
	 * 作者
	 */
	private User author;

	@JsonIgnore
	private PostAttribute attribute;
}
