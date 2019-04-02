package com.stu.pattern.strategy.promotion;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PromotionActivity {
    private IPromotionStrategy promotionStrategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void doPromotion()
    {
        this.promotionStrategy.doPromotion();
    }
}
