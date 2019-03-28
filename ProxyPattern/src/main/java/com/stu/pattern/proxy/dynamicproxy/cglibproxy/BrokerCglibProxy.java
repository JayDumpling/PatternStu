package com.stu.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class BrokerCglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz)
    {
        //代理工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return null;
    }

    private void after() {
        System.out.println("收钱");
    }

    private void before() {
        System.out.println("恰谈，签合同");
    }
}
