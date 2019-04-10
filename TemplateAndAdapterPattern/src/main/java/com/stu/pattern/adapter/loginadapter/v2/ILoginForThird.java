package com.stu.pattern.adapter.loginadapter.v2;

import com.stu.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Auther : Dumpling
 * @Description
 **/
public interface ILoginForThird {
    ResultMsg LoginForWeChat(String id);
    ResultMsg LoginForQQ(String id);
}
