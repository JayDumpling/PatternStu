package com.stu.pattern.adapter.simple;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
