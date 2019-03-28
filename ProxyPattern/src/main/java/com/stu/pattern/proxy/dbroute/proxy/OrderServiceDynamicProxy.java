package com.stu.pattern.proxy.dbroute.proxy;

import com.stu.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private Object target;

    public Object getInstance(Object target)
    {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void before(Object order) {
        try {
            Method method = order.getClass().getMethod("getCreateTime");
            Long createTime = (Long)method.invoke(order);
            Integer dbRoute = Integer.valueOf(sdf.format(new Date(createTime)));
            DynamicDataSourceEntity.set(dbRoute);
            System.out.println("切换至" + DynamicDataSourceEntity.get() + "数据源");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void after() {
        DynamicDataSourceEntity.restore();
        System.out.println("恢复至"+ DynamicDataSourceEntity.get() + "数据源");
    }
}
