package com.stu.pattern.template.course;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class EnglishCourse extends Course{
    @Override
    void teaching() {
        System.out.println("英语授课");
    }

    @Override
    void checkHomework() {
        System.out.println("检查英语作业");
    }
}
