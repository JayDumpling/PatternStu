package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现金额到支付宝账号");
    }
}
