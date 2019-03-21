package com.stu.pattern.factory.factorymethod;

import com.stu.pattern.factory.Course;

/**
 * @Auther:Dumpling
 * @Date:2019/3/192114
 * @Description
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Course course = courseFactory.create();
        course.record();
    }
}
