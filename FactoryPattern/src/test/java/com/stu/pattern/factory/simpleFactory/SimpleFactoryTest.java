package com.stu.pattern.factory.simpleFactory;

import com.stu.pattern.factory.Course;
import com.stu.pattern.factory.JavaCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * @Auther:Dumpling
 * @Date:2019/3/192030
 * @Description
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        /*Course course = new JavaCourse();
        Course course1 = new PythonCourse();
        course.record();
        course1.record();*/

        CourseFactory courseFactory = new CourseFactory();
       /* Course javaCourse = courseFactory.createCourse("com.stu.pattern.factory.JavaCourse");
        javaCourse.record();*/
       Course course = courseFactory.createCourse(JavaCourse.class);
        course.record();

    }
}
