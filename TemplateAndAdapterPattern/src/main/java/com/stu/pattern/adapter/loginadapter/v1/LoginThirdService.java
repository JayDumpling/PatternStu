package com.stu.pattern.adapter.loginadapter.v1;

import com.stu.pattern.adapter.loginadapter.LoginService;
import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class LoginThirdService {
    private LoginService loginService;

    public LoginThirdService(LoginService loginService) {
        this.loginService = loginService;
    }
    public ResultMsg loginForWechat(String openId)
    {
        return registerAndLogin(openId,null);
    }

    public ResultMsg loginForToken(String token)
    {
        //通过token获取用户名密码再重新登录
        return null;
    }

    public ResultMsg registerAndLogin(String username,String password)
    {
        loginService.register(username,password);
        return loginService.login(username,password);
    }
}
