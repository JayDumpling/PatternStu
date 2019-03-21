package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class HWTV implements ITV {
    @Override
    public void produce() {
        System.out.println("华为电视生产...");
    }
}
