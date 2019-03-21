package com.boke.pattern.factory.abstractfactory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/2018
 * @Description
 **/
public class HWProductFactory implements IProductFactory {
    @Override
    public ITV createTV() {
        return new HWTV();
    }

    @Override
    public IPhone createPhone() {
        return new HWPhone();
    }
}
