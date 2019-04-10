package com.stu.pattern.adapter.poweradapter;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PowerAdapter1 implements DC5{
    private AC220 ac220;

    public PowerAdapter1(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        return ac220.outputAC220V()/44;
    }
}
