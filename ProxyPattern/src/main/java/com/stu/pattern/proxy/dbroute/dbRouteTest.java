package com.stu.pattern.proxy.dbroute;

import com.stu.pattern.proxy.dbroute.dao.OrderDao;
import com.stu.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.stu.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class dbRouteTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Order order = new Order();
            order.setId("1");
            order.setInfo("订单1");
            Date date = sdf.parse("2017-06-06");
            order.setCreateTime(date.getTime());
            //IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
