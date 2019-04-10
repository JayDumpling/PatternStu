package com.stu.pattern.adapter.poweradapter;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class AC220 {
    public int outputAC220V()
    {
        int output = 220;
        System.out.println("输出电压" + output + "V");
        return output;
    }
}
