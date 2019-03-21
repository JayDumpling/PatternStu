package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class MITV implements ITV {
    @Override
    public void produce() {
        System.out.println("小米电视生产...");
    }
}
