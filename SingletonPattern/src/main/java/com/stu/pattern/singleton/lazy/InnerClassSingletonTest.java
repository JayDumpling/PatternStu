package com.stu.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2115
 * @Description
 **/
public class InnerClassSingletonTest {
    public static void main(String[] args) {
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerClassSingleton);
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            LazyInnerClassSingleton lazyInnerClassSingleton2 = (LazyInnerClassSingleton)c.newInstance();
            System.out.println(lazyInnerClassSingleton2);
            System.out.println(lazyInnerClassSingleton == lazyInnerClassSingleton2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
