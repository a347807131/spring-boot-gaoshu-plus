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
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 21:26
 */
@Data
@Entity
@Table(name ="tb_comments" )
public class Comment implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "uid")
	private User author;

	/**评论内容*/
	@Type(type = "text")
	private String content;

	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="cid")
	private List<Attach> attachs;

	@Temporal(value = TemporalType.TIMESTAMP)
	//设置不可readonly
	@Column(insertable = false, updatable = false)
	//设置更改时自动更新为当前时间
	@Generated(GenerationTime.INSERT)
	private Date created;

	private int status;
}
