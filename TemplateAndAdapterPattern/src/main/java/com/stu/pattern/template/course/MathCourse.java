package com.stu.pattern.template.course;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MathCourse extends Course{
    private boolean needHomework;

    public MathCourse(boolean needHomework) {
        this.needHomework = needHomework;
    }

    @Override
    void teaching() {
        System.out.println("数学授课");
    }

    @Override
    protected boolean needHomework() {
        return needHomework;
    }

    @Override
    void checkHomework() {
        System.out.println("检查数学作业");
    }
}
