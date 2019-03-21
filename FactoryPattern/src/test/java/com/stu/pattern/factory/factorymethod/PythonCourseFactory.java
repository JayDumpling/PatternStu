package com.stu.pattern.factory.factorymethod;

import com.stu.pattern.factory.Course;
import com.stu.pattern.factory.PythonCourse;

/**
 * @Auther:Dumpling
 * @Date:2019/3/19
 * @Description
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
