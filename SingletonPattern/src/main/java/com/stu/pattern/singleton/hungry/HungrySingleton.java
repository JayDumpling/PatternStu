package com.stu.pattern.singleton.hungry;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description 饿汉式单例
 **/
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
            return hungrySingleton;
    }
}
