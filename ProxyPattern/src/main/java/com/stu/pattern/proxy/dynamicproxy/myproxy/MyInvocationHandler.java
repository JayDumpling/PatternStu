package com.stu.pattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * @Auther : Dumpling
 * @Description
 **/
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
