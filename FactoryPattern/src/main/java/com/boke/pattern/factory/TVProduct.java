package com.boke.pattern.factory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2015
 * @Description
 **/
public class TVProduct implements IProduct {
    @Override
    public void produce() {
        System.out.println("生产电视");
    }
}
