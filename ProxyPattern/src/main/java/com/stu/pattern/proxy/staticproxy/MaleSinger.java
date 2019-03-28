package com.stu.pattern.proxy.staticproxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MaleSinger implements ISingStar {
    private String name;

    public MaleSinger(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("大家好我是"+ name + "，跟我一起唱");
    }
}
