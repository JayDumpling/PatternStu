package com.stu.pattern.proxy.dynamicproxy.jdkproxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MaleMovieStar implements IMovieStar {
    String name;

    public MaleMovieStar(String name) {
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println("大家好，我是"+ name + ",演戏");
    }
}
