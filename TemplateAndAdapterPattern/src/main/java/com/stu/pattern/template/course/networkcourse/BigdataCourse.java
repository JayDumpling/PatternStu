package com.stu.pattern.template.course.networkcourse;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class BigdataCourse extends NetworkCourse {
    private boolean isNeedHomework;

    public BigdataCourse(boolean isNeedHomework) {
        this.isNeedHomework = isNeedHomework;
    }

    @Override
    protected boolean needHomework() {
        return isNeedHomework;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据课程作业");
    }
}
