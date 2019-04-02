package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class GroupBuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购促销，满20人参加团购活动");
    }
}
