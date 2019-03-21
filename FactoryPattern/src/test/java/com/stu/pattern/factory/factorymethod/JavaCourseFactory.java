package com.stu.pattern.factory.factorymethod;

import com.stu.pattern.factory.Course;
import com.stu.pattern.factory.JavaCourse;

/**
 * @Auther:Dumpling
 * @Date:2019/3/192112
 * @Description
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
