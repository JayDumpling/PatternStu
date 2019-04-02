package com.stu.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class Manager {
    private Map<String,IEmployee> map = new HashMap<String, IEmployee>();

    public Manager()
    {
        map.put("登录",new EmployeeA());
        map.put("加密",new EmployeeB());
    }

    void doing(String command)
    {
        IEmployee employee = map.get(command);
        employee.doing(command);
    }
}
