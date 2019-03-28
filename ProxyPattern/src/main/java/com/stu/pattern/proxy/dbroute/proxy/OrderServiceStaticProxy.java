package com.stu.pattern.proxy.dbroute.proxy;

import com.stu.pattern.proxy.dbroute.IOrderService;
import com.stu.pattern.proxy.dbroute.Order;
import com.stu.pattern.proxy.dbroute.OrderService;
import com.stu.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class OrderServiceStaticProxy implements IOrderService {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void createOrder(Order order)
    {
        Long createTime = order.getCreateTime();
        Integer dbRoute = Integer.valueOf(sdf.format(new Date(createTime)));
        DynamicDataSourceEntity.set(dbRoute);
        System.out.println("切换至"+ DynamicDataSourceEntity.get() + "数据源");
        orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        System.out.println("恢复至"+ DynamicDataSourceEntity.get() + "数据源");
    }

}
