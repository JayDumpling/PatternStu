package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2017
 * @Description
 **/
public interface IProductFactory {
    ITV createTV();
    IPhone createPhone();
}
