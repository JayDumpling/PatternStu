package com.stu.pattern.singleton.threadlocal;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance()
    {
        return threadLocalSingleton.get();
    }

}
