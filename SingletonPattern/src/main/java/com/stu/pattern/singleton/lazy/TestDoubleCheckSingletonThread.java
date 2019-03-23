package com.stu.pattern.singleton.lazy;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class TestDoubleCheckSingletonThread implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazyDoubleCheckSingleton);
    }
}
