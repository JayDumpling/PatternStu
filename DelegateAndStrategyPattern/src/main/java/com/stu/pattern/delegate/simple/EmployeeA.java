package com.stu.pattern.delegate.simple;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我正在做"+ command);
    }
}
