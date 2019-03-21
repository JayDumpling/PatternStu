package com.stu.pattern.factory;

/**
 * @Auther:Dumpling
 * @Date:2019/3/192030
 * @Description
 **/
public class PythonCourse implements Course {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
