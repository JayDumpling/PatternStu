package com.stu.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class BrokerDynamicProxy implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target)
    {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("收钱");
    }

    private void before() {
        System.out.println("恰谈，签合同");
    }
}
