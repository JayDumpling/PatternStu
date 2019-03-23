package com.stu.pattern.singleton.lazy;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}
    //这种方式肯定不可取会造成线程一直阻塞在getInstance
    public static synchronized LazySingleton getInstance()
    {
        if (lazySingleton == null)
             lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
