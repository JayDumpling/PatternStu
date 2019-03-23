package com.stu.pattern.singleton.threadlocal;

import com.stu.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
            }
        };
        t1.start();
        t2.start();
    }
}
