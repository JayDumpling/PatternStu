package com.boke.pattern.factory.factorymethod;

import com.boke.pattern.factory.IProduct;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2016
 * @Description
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        IProductFactory factory = new TVFactory();
        IProduct product = factory.createProduct();
        product.produce();

        factory = new FridgeFactory();
        product = factory.createProduct();
        product.produce();
    }
}
