package com.boke.pattern.factory.simplefactory;

import com.boke.pattern.factory.IProduct;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2015
 * @Description
 **/
public class ProductFactory {
    /*public IProduct createProduct(String productName)
    {
        if ("TV".equals(productName))
            return new TVProduct();
        else if("Fridge".equals(productName))
            return new FridgeProduct();
        return null;
    }*/
   /* public IProduct createProduct(String className)
    {
        try {
            if (!(className == null || className.equals("")))
                return (IProduct)Class.forName(className).newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }*/
    public IProduct createProduct(Class<? extends IProduct> clazz)
    {
        try {
            if (clazz != null)
                return (IProduct)clazz.newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
