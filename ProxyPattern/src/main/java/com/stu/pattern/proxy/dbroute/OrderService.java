package com.stu.pattern.proxy.dbroute;

import com.stu.pattern.proxy.dbroute.dao.OrderDao;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class OrderService implements IOrderService {
    OrderDao orderDao;

    public OrderService() {
        this.orderDao = new OrderDao();
    }

    @Override
    public void createOrder(Order order) {
        this.orderDao.insert(order);
    }
}
