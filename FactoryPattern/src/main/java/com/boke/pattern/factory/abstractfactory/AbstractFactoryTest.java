package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IProductFactory productFactory = new HWProductFactory();
        productFactory.createPhone().produce();
        productFactory.createTV().produce();

        productFactory = new MIProductFactory();
        productFactory.createPhone().produce();
        productFactory.createTV().produce();
    }
}
