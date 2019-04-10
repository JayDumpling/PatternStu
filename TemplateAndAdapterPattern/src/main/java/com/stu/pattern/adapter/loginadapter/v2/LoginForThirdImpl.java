package com.stu.pattern.adapter.loginadapter.v2;

import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class LoginForThirdImpl implements ILoginForThird {
    @Override
    public ResultMsg LoginForWeChat(String id) {
        return processLogin(id,LoginForWeChatAdapter.class);
    }
    @Override
    public ResultMsg LoginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }
    private ResultMsg processLogin(String id,Class<? extends LoginAdapter> clazz)
    {
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if (loginAdapter.support(loginAdapter))
                return loginAdapter.login(id,loginAdapter);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
