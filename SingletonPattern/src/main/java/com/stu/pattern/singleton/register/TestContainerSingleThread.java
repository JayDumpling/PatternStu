package com.stu.pattern.singleton.register;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class TestContainerSingleThread implements Runnable{
    @Override
    public void run() {
        ContainerSingleton cs = (ContainerSingleton) ContainerSingleton.getInstance("com.stu.pattern.singleton.register.ContainerSingleton");
        System.out.println(Thread.currentThread().getName()+":"+cs);
    }
}
