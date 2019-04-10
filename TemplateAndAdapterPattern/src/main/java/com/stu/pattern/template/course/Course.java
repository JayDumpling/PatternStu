package com.stu.pattern.template.course;

/**
 * @Auther : Dumpling
 * @Description
 **/
public abstract class Course {
    protected final void createCourse()
    {
        //1.发布预习资料
        postPreSource();
        //2.制作ppt
        createPPT();
        //3.授课
        teaching();
        //4.检查作业（有作业才需要检查作业）,默认是有作业的
        if (needHomework())
        {
            checkHomework();
        }
    }

    private final void postPreSource()
    {
        System.out.println("发布预习资料");
    }

    private final void createPPT() {
        System.out.println("制作上课使用的PPT");
    }

    abstract void teaching();

    protected boolean needHomework(){
        return true;
    }

    abstract void checkHomework();
}
