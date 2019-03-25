package com.stu.pattern.prototype.refactor;

import com.alibaba.fastjson.JSON;

public class Test {

    public static PlayRecord getPlayRecord1(UserPlayRecord userPlayRecord)
    {
        PlayRecord record = new PlayRecord();
        record.setConAlbumId(userPlayRecord.getConAlbumId());;
        record.setConContentId(userPlayRecord.getConContentId());
        record.setCategory1Ids(userPlayRecord.getCategory1Ids());
        record.setCategory2Ids(userPlayRecord.getCategory2Ids());
        //...给对象赋值很繁琐
        return record;
    }
    public static PlayRecord getPlayRecord2(UserPlayRecord userPlayRecord)
    {
        PlayRecord record = new PlayRecord();
        String strjson = JSON.toJSONString(userPlayRecord);
        record = JSON.parseObject(strjson,PlayRecord.class);
        return record;
    }
    public static void main(String[] args) {
        UserPlayRecord userPlayRecord = new UserPlayRecord();
        userPlayRecord.setConAlbumId(Long.valueOf(1001));
        userPlayRecord.setConContentId(Long.valueOf(5656));
        userPlayRecord.setCategory1Ids("3333");
        userPlayRecord.setCategory2Ids("4444");

        PlayRecord record = getPlayRecord1(userPlayRecord);
        System.out.println(record.toString());

        PlayRecord record1 = getPlayRecord2(userPlayRecord);
        System.out.println(record1);
    }
}
