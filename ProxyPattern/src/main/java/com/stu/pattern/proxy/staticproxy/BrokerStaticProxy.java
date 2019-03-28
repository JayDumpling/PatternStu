package com.stu.pattern.proxy.staticproxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class BrokerStaticProxy implements ISingStar{
    private ISingStar singStar;

    public BrokerStaticProxy(ISingStar singStar) {
        this.singStar = singStar;
    }

    public void sing()
    {
        before();
        this.singStar.sing();
        after();
    }

    private void after() {
        System.out.println("收钱");
    }

    private void before() {
        System.out.println("恰谈，签合同");
    }
}
