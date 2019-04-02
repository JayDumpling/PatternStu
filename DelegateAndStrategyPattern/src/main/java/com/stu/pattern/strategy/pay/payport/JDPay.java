package com.stu.pattern.strategy.pay.payport;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
