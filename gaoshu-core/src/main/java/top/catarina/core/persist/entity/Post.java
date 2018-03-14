/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 13:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "tb_posts")
public class Post extends BaseEntity {
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
	@Column(length = 16)
	private String tag;
	/**
	 * 内容
	 */
	@Type(type = "text")
	private String content;

	/**
	 * 浏览数
	 */
	private int views;

	@Temporal(value = TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created;

	@Temporal(value = TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date lastUpdate;
	/**
	 * 作者
	 */
	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;

	@OneToMany
	@JoinColumn(name = "pid")
	private List<Attach> attaches;
}
