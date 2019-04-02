package com.stu.pattern.delegate.simple;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("加密",new Manager());
    }
}
