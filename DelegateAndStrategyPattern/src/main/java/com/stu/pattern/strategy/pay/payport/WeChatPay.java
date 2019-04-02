package com.stu.pattern.strategy.pay.payport;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
