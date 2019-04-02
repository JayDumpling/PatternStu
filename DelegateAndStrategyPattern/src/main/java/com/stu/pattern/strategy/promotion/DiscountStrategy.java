package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class DiscountStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("打折活动，折扣8折");
    }
}
