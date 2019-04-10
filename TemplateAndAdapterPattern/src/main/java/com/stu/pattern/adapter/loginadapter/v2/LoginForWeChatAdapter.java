package com.stu.pattern.adapter.loginadapter.v2;

import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class LoginForWeChatAdapter extends LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String username,Object adapter) {
        super.loginService.register(username,null);
        return super.loginService.login(username,null);
    }
}
