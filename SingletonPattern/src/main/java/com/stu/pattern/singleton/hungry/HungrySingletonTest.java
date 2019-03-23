package com.stu.pattern.singleton.hungry;

/**
 * @Auther:Dumpling
 * @Date:2019/3/21
 * @Description
 **/
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton ins1 = HungrySingleton.getInstance();
        HungrySingleton ins2 = HungrySingleton.getInstance();
        System.out.println(ins1);
        System.out.println(ins2);
    }
}
