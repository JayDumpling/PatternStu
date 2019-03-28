package com.stu.pattern.proxy.dynamicproxy.cglibproxy;


/**
 * @Auther : Dumpling
 * @Description
 **/
public class CglibProxyTest {
    public static void main(String[] args) {

        MovieStar movieStar = (MovieStar)new BrokerCglibProxy().getInstance(MovieStar.class);
        movieStar.perform();
        SingStar singStar = (SingStar)new BrokerCglibProxy().getInstance(SingStar.class);
        singStar.sing();
    }
}
