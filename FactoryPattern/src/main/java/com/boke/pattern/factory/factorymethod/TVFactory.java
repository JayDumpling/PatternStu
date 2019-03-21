package com.boke.pattern.factory.factorymethod;

import com.boke.pattern.factory.IProduct;
import com.boke.pattern.factory.TVProduct;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2016
 * @Description
 **/
public class TVFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new TVProduct();
    }
}
