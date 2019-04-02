package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券直接抵扣");
    }
}
