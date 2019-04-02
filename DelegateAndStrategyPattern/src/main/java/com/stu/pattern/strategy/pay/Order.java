package com.stu.pattern.strategy.pay;

import com.stu.pattern.strategy.pay.payport.PayStrategyManager;
import com.stu.pattern.strategy.pay.payport.Payment;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
    public MsgResult pay(String key)
    {
        Payment payment= PayStrategyManager.get(key);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额是：" + amount + "开始扣款");
        return payment.pay(uid,amount);
    }

    public MsgResult pay()
    {
        return pay(PayStrategyManager.DEFAULT_PAY);
    }
}
