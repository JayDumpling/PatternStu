package com.stu.pattern.proxy.dynamicproxy.myproxy;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MyClassLoader extends ClassLoader{
    private File classPathFile;
    public MyClassLoader()
    {
        String classPath = MyClassLoader.class.getResource("").getPath();
        classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+ "." + name;
        if (classPathFile != null)
        {
            File classFile = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            if (classFile.exists())
            {
                FileInputStream in = null;
                ByteOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteOutputStream();
                    byte [] bytes = new byte[1024];
                    int len;
                    while ((len = in.read(bytes)) != -1)
                    {
                        out.write(bytes,0,len);
                    }
                    return  defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
