/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 17:11
 */
@Data
@Entity
@Table(name = "tb_orders")
public class Order implements Serializable {
	/**
	 * 根据微信文档设置的属性名字
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long outTradeNo;

	/**
	 * 所属用户openId
	 */
	@Column(name = "openid", length = 32, unique = true,nullable = false)
	private String openId;
	private int status;

	/**
	 * 商品描述
	 */
	@Column(length =64)
	private String body;

	/**
	 * 总金额
	 */
	@Column(nullable = false)
	private int totalFee;

	/**
	 * 交易起始时间
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date timeStart;

	/**
	 * 交易结束时间
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date timeExpire;

	@Column(name = "spbill_create_ip",nullable = false)
	private String spbillCreateIp;
}
