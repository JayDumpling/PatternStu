package com.stu.pattern.adapter.loginadapter.v2;

import com.stu.pattern.adapter.loginadapter.LoginService;
import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public abstract class LoginAdapter {
    protected LoginService loginService = new LoginService();
    abstract boolean support(Object adapter);
    abstract ResultMsg login(String id,Object adapter);
}
