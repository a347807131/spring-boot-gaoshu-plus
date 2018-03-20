/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service;


import top.catarina.core.persist.entity.Order;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 19:46
 */
public interface OrderService {
	/**
	 *
	 * @param id 主键
	 * @return data类
	 */
	Order get(long id);
	/**
	 * 保存
	 * @param order 订单data类
	 * @return uuid
	 */
	long create(Order order);

	/**
	 * 取消订单
	 * @param id 主键
	 */
	void cancel(long id);

	/**
	 * 将已支付的订单完结
	 * @param id 主键
	 */
	void complete(long id);

	/**
	 * 更改订单的状态
	 * @param status 所要保存的状态
	 * @param id 主键
	 */
	void changeStatus(long id, int status);


}
