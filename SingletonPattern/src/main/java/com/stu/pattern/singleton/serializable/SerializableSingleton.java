package com.stu.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance()
    {
        return INSTANCE;
    }
    private Object readResolve()
    {
        return INSTANCE;
    }
}
