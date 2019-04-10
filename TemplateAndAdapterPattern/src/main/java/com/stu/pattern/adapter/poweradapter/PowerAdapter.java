package com.stu.pattern.adapter.poweradapter;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PowerAdapter extends AC220 implements DC5{


    @Override
    public int outputDC5V() {
        int output = super.outputAC220V()/44;
        System.out.println("输出电压"+ output + "V");
        return output;
    }
}
