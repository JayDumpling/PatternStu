package com.stu.pattern.singleton.lazy;

import javax.management.RuntimeErrorException;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if (LazyHolder.LAZY != null)
            throw new RuntimeException("不允许创建多个实例");
    }

    public static final LazyInnerClassSingleton getInstance()
    {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder
    {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
