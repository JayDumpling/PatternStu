package com.stu.pattern.adapter.poweradapter;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter1(new AC220());
        powerAdapter.outputDC5V();
    }
}
