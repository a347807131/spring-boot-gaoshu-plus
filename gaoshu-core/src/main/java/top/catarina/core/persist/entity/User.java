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
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 21:21
 */
@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	/**
	 * 相对于公众号的唯一用户标识
	 */
	@Column(unique = true,length = 20)
	private String openId;

	/**用戶名*/
	@Column(unique = true,length = 64)
	private String username;

	/**昵稱*/
	@Column(name = "nickname",length = 64)
	private String nickname;

	/**头像*/
	private String avatar;

	/**性别*/
	private int gender;

	/**手机号*/
	@Column(name = "mobile",length = 11)
	private String mobile;

	/**提问数*/
	private int posts;

	/**金币数*/
	private int golds;

	/**注册时间*/
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(updatable = false,insertable = false)
	//设置插入数据时自动更新为当前时间
	@CreationTimestamp
	private Date created;

	@Column(name = "last_login",insertable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	//设置更改或插入数据时自动更新为当前时间
	@UpdateTimestamp
	private Date lasgLogin;

	/**用户状态*/
	private int status;

	@ManyToOne
	@JoinColumn(name = "cid")
	private College college;


}
