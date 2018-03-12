/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.*;

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
 * @since 2018-03-07 21:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name ="tb_comments" )
public class Comment extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "uid")
	private User author;

	/**评论内容*/
	@Type(type = "text")
	private String content;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private List<Attach> attachs;

	@Temporal(value = TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created;

	private int status;
}
