package com.stu.pattern.template.course.networkcourse;

/**
 * @Auther : Dumpling
 * @Description
 **/
public abstract class NetworkCourse {
    protected void createCourse()
    {
        this.postPreResource();

        this.createPPT();

        this.liveVideo();

        this.postSource();

        if (needHomework())
        {
            checkHomework();
        }
    }

    protected boolean needHomework(){
        return false;
    }

    abstract void checkHomework();

    private final void postSource(){
        System.out.println("提交源代码");
    }

    private final void postNote(){
        System.out.println("提交课件和笔记");
    }

    private final void liveVideo(){
        System.out.println("直播授课");
    }

    private final void createPPT(){
        System.out.println("创建备课PPT");
    }

    private final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
