package com.stu.pattern.adapter.simple;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
