/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 13:53
 */
@Data
@Entity
@Table(name = "tb_posts")
public class Post implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**
	 * 标题
	 */
	@Column(name = "title", length = 64)
	private String title;

	/**
	 * 访问权限
	 */
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
	@Column(nullable = false,length = 16)
	private String tag;

	/**
	 * 浏览数
	 */
	private int views;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(updatable = false,insertable = false)
	//设置插入数据时自动更新为当前时间
	@CreationTimestamp
	private Date created;

	@Temporal(value = TemporalType.TIMESTAMP)
	//设置更改或插入数据时自动更新为当前时间
	@Column(insertable = false)
	@UpdateTimestamp
	private Date lastUpdate;
	/**
	 * 作者
	 */
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "author_id")
	private User author;


	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn //配置共享主键，否则会额外生成外键关联列
	private PostAttribute attribute;
}
