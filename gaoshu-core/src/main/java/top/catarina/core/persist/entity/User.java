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
import org.hibernate.validator.constraints.NotBlank;

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

	//*************微信oauth认证后的返回的字段*******************
	/**
	 * 相对于公众号的唯一用户标识
	 */
	@Column(unique = true,length = 32)
	private String openId;
	/**
	 * 是否关注
	 */
	@Column( columnDefinition = "tinyint(0) default 1")
	private boolean subscribe;

	/**昵稱*/
	@Column(name = "nickname",length = 64)
	private String nickname;

	/**头像*/
	private String headImgUrl;

	/**性别*/
	private String sex;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 关注公众号的时间 毫秒计数
	 */
	private Long subscribeTime;

	//***************以下为项目中的字段****************

	/**手机号*/
	/*@Column(length = 11)
	private String mobile;*/

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
