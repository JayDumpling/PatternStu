package com.stu.pattern.singleton.hungry;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrystaticSingleton;

    static {
        hungrystaticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
            return hungrystaticSingleton;
    }
}
