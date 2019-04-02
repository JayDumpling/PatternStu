package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PromotionStrategyTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CashBackStrategy());
        promotionActivity.doPromotion();
    }
}
