package com.stu.pattern.singleton.lazy;


/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class LazySingletonTest {
    public static void main(String[] args) {
        /*LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);*/
        Thread t1 = new Thread(new TestLazySingletonThread());
        Thread t2 = new Thread(new TestLazySingletonThread());
        t1.start();
        t2.start();
        System.out.println("Main End");
        /*Thread t1 = new Thread(new TestDoubleCheckSingletonThread());
        Thread t2 = new Thread(new TestDoubleCheckSingletonThread());
        t1.start();
        t2.start();
        System.out.println("Main End");*/
    }
}
