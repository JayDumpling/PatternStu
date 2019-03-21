package com.stu.pattern.factory.simpleFactory;

import com.stu.pattern.factory.Course;

/**
 * @Auther:Dumpling
 * @Date:2019/3/192033
 * @Description
 **/
public class CourseFactory {
//    public Course createCourse(String name)
//    {
//        if (name.equals("java"))
//        {
//            return new JavaCourse();
//        }
//        else if (name.equals("python"))
//        {
//            return new PythonCourse();
//        }
//        return null;
//    }
   /* public Course createCourse(String clssName)
    {
        try {
            if (clssName != null && !clssName.equals(""))
            {
                return (Course) Class.forName(clssName).newInstance();
            }
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }
        return null;
    }*/
    public Course createCourse(Class clazz)
    {
        try {
            if (clazz != null)
                return (Course)clazz.newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  null;
    }
}
