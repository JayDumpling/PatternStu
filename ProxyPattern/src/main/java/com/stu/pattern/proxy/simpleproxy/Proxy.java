package com.stu.pattern.proxy.simpleproxy;

public class Proxy {
    private Subject subject;
    public Proxy(Subject subject) {
        this.subject = subject;
    }
    void request()
    {
        before();
        this.subject.request();
        after();
    }

    private void before() {
        System.out.println("before request ....");
    }

    private void after() {
        System.out.println("after request ...");
    }
}
