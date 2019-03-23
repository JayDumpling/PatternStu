package com.stu.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class ContainerSingleton {
    private static Map<String,Object> ios = new ConcurrentHashMap<>();

    private ContainerSingleton(){}

    public static Object getInstance(String className)
    {
        if (!ios.containsKey(className)) {
            synchronized (ios) {
                if (!ios.containsKey(className)) {
                    try {
                        Object obj = Class.forName(className).newInstance();
                        ios.put(className, obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return ios.get(className);
    }
}
