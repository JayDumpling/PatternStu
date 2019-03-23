package com.stu.pattern.singleton.register;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance()
    {
        return INSTANCE;
    }
}
