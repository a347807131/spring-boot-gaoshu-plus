/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catarina.base.lang.Enums;
import top.catarina.core.persist.dao.OrderDao;
import top.catarina.core.persist.entity.Order;
import top.catarina.core.persist.service.OrderService;
import java.util.Date;

/**
 * @author Civin
 * @email Civin@bupt.edu.cn
 * @date 2018-03-06 19:48
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	public Order get(long id) {
		return orderDao.getOne(id);
	}

	@Override
	public long create(Order order) {
		return orderDao.save(order).getOutTradeNo();

	}

	@Override
	public void cancel(long id) {
		changeStatus(id, Enums.StatusOrder.CANCELLED.ordinal());
	}

	@Override
	public void complete(long id) {
		changeStatus(id,Enums.StatusOrder.PAID.ordinal());
	}

	@Override
	public void changeStatus(long id,int status) {
		Order po = orderDao.getOne(id);
		po.setStatus(status);
		orderDao.save(po);
	}

}
