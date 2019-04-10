package com.stu.pattern.template.course;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class CourseTest {
    public static void main(String[] args) {
        Course engCourse = new EnglishCourse();
        engCourse.createCourse();
        System.out.println("==================");
        Course mathCourse = new MathCourse(false);
        mathCourse.createCourse();
    }
}
