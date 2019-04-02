package com.stu.pattern.delegate.simple;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class Boss {
    void command(String command, Manager manager)
    {
        manager.doing(command);
    }
}
