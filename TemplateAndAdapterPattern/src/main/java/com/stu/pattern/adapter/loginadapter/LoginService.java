package com.stu.pattern.adapter.loginadapter;

import com.stu.pattern.adapter.loginadapter.Member;
import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class LoginService {
    //注册方法
    public ResultMsg register(String username,String password)
    {
        return new ResultMsg(200,"注册成功",new Member());
    }
    //登录方法
    public ResultMsg login(String username,String password)
    {
        return new ResultMsg(200,"登录成功",new Member());
    }
}
