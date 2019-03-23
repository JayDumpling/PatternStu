package com.stu.pattern.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Auther:Dumpling
 * @Date:2019/3/22
 * @Description
 **/
public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton singleton1 = null;
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("serializationSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(singleton2);
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream("serializationSingleton.obj");
            ObjectInputStream is = new ObjectInputStream(fis);
            singleton1 = (SerializableSingleton)is.readObject();
            is.close();

            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton1 == singleton2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
