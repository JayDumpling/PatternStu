package com.stu.pattern.prototype.deep;

import java.util.Date;

public class DeepTest {
    public static void main(String[] args) {
        QiTianDaSheng q1 = new QiTianDaSheng();
        try {
            QiTianDaSheng q2 = (QiTianDaSheng)q1.clone();
            System.out.println(q1.jingubang == q2.jingubang);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
