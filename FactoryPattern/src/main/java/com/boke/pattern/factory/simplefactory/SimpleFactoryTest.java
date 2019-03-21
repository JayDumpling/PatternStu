package com.boke.pattern.factory.simplefactory;

import com.boke.pattern.factory.FridgeProduct;
import com.boke.pattern.factory.IProduct;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2015
 * @Description
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        /*IProduct product = new TVProduct();
        product.produce();*/
        /*ProductFactory productFactory = new ProductFactory();
        IProduct product= productFactory.createProduct("Fridge");
        product.produce();*/
        /*ProductFactory productFactory = new ProductFactory();
        IProduct product= productFactory.createProduct("com.boke.pattern.factory.FridgeProduct");
        product.produce();*/
        ProductFactory productFactory = new ProductFactory();
        IProduct product= productFactory.createProduct(FridgeProduct.class);
        product.produce();
    }
}
