package com.stu.pattern.singleton.register;

import com.stu.pattern.singleton.serializable.SerializableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
        /*EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(enumSingleton1);
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream is = new ObjectInputStream(fis);
            enumSingleton2 = (EnumSingleton)is.readObject();
            is.close();

            System.out.println(enumSingleton1);
            System.out.println(enumSingleton2);
            System.out.println(enumSingleton1 == enumSingleton2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }*/
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            c.newInstance("singleton",666);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
