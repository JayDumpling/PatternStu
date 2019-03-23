package com.stu.pattern.singleton.lazy;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description 双重检查锁单例模式
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance()
    {
        if (lazyDoubleCheckSingleton == null)
        {
            synchronized (LazyDoubleCheckSingleton.class)
            {
                if (lazyDoubleCheckSingleton == null)
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
