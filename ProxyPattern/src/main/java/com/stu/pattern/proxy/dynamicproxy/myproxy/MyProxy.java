package com.stu.pattern.proxy.dynamicproxy.myproxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;

/**
 * @Auther : Dumpling
 * @Description 自己编写简单的JDK动态代理
 **/
public class MyProxy {
    public static Object newProxyInstance(MyClassLoader classLoader, Class<?>[] interfaces, MyInvocationHandler h)
    {
        try {
            //1.动态生成源代码.java
            String src = generateProxySrc(interfaces);
            //2.Java文件输入到本地磁盘
            String path = MyProxy.class.getResource("").getPath();
            File file = new File(path + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //3.把生成的.java文件编译成.class
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.把编译后的.class加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
            //5.返回字节码重组后新的代理对象
            return c.newInstance(h);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateProxySrc(Class<?>[] interfaces) {
        return null;
    }
}
