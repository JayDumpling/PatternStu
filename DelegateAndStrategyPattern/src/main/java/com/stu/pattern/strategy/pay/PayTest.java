package com.stu.pattern.strategy.pay;

import com.stu.pattern.strategy.pay.payport.PayStrategyManager;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("1","201801020558",500);
        System.out.println(order.pay(PayStrategyManager.ALI_PAY));
    }
}
