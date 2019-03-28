package com.stu.pattern.proxy.dbroute.dao;

import com.stu.pattern.proxy.dbroute.Order;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class OrderDao {
    public int insert(Order order)
    {
        System.out.println("创建Order成功");
        return 1;
    }
}
