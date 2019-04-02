package com.stu.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PayStrategyManager {
    public static final String ALI_PAY = "Alipay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;
    private static Map<String,Payment> payStrategies = new HashMap<>();
    static {
        payStrategies.put(ALI_PAY,new AliPay());
        payStrategies.put(JD_PAY,new JDPay());
        payStrategies.put(WECHAT_PAY,new WeChatPay());
        payStrategies.put(UNION_PAY,new UnionPay());
    }
    public static Payment get(String key)
    {
        if (!payStrategies.containsKey(key))
            return payStrategies.get(DEFAULT_PAY);
        return payStrategies.get(key);
    }
}
