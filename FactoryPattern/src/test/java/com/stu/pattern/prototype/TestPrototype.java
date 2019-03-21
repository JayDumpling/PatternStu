package com.stu.pattern.prototype;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class TestPrototype {
    @Test
    public void testPrototypeFunc()
    {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("examinationPaper_id","10001");
        jsonObject.put("leavTime","60");
        jsonObject.put("organization_id","136");
        jsonObject.put("id","03");
        jsonObject.put("examroom_id","101");
        /*if(jsonObject.getString("examinationPaper_id")!= null && (!jsonObject.getString("examinationPaper_id").equals("")))
            curForm.setExaminationPaper_id(jsonObject.getLong("examinationPaper_id"));*/
        String params = jsonObject.toJSONString();
        //Gw_exammingForm curForm =JSONObject.parse(params,Gw_exammingForm.class);
        //ExamPaper examPaper = JSONObject.parse(params,ExamPaper.class);
        System.out.println(params);
    }

}
