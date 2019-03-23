package com.stu.pattern.singleton.lazy;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description 测试简单懒汉式单例线程
 **/
public class TestLazySingletonThread implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
