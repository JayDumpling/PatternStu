package com.stu.pattern.proxy.staticproxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        ISingStar singStar = new MaleSinger("周杰伦");
        BrokerStaticProxy staticProxy = new BrokerStaticProxy(singStar);
        staticProxy.sing();
    }
}
