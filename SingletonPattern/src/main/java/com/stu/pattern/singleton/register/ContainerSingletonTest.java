package com.stu.pattern.singleton.register;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class ContainerSingletonTest {
    public static void main(String[] args) {
        /*ContainerSingleton cs = (ContainerSingleton)ContainerSingleton.getInstance("com.stu.pattern.singleton.register.ContainerSingleton");
        ContainerSingleton cs1 = (ContainerSingleton)ContainerSingleton.getInstance("com.stu.pattern.singleton.register.ContainerSingleton");
        System.out.println(cs);
        System.out.println(cs1);
        System.out.println(cs == cs1);*/
        Thread t1 = new Thread(new TestContainerSingleThread());
        Thread t2 = new Thread(new TestContainerSingleThread());
        t1.start();
        t2.start();
        System.out.println("main end");
    }
}
