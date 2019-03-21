package com.boke.pattern.factory.factorymethod;

import com.boke.pattern.factory.FridgeProduct;
import com.boke.pattern.factory.IProduct;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2016
 * @Description
 **/
public class FridgeFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new FridgeProduct();
    }
}
