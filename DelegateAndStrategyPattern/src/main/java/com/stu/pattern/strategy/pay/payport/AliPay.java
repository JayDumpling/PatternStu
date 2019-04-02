package com.stu.pattern.strategy.pay.payport;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
