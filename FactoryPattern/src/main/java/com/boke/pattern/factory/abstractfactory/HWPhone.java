package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class HWPhone implements IPhone {
    @Override
    public void produce() {
        System.out.println("华为手机生产...");
    }
}
