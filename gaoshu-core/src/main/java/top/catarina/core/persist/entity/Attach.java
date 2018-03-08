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

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 21:28
 */
@Data
@Entity
@Table(name = "tb_attachs")
public class Attach implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	/**
	 * 该素材在微信服务器上临时的id
	 */
	@Column(name = "m_id")
	private String mId;
	/**
	 * 所属post的id
	 */
	@Column(name = "to_id")
	private long toId;

	/**
	 * 原图链接
	 */
	private String original;

	/**
	 * 预览图片链接
	 */
	private String preview;

	private int width;

	private int height;

	private int status;

}
