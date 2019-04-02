package com.stu.pattern.strategy.nostrategy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PromotionManager {
    public void doPromotion(String sType)
    {
        if("coupon".equals(sType))
        {
            System.out.println("领取优惠券直接抵扣");
        }
        else if ("cashBack".equals(sType))
        {
            System.out.println("返现促销，返现金额到支付宝账号");
        }
        else if ("groupBuy".equals(sType))
        {
            System.out.println("团购促销，满20人参加团购活动");
        }
    }
}
