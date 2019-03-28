package com.stu.pattern.proxy.simpleproxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real Subject Called");
    }
}
