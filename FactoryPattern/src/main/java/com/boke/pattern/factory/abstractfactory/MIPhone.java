package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class MIPhone implements IPhone {
    @Override
    public void produce() {
        System.out.println("小米手机生产...");
    }
}
