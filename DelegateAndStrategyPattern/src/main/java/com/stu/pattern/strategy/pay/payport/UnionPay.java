package com.stu.pattern.strategy.pay.payport;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 2000;
    }
}
