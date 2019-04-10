package com.stu.pattern.template.course.networkcourse;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class NetCourseTest {
    public static void main(String[] args) {
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("==============================================");
        NetworkCourse bigdataCourse = new BigdataCourse(true);
        bigdataCourse.createCourse();
    }
}
