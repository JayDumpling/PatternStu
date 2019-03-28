package com.stu.pattern.proxy.dbroute.db;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class DynamicDataSourceEntity {
    private final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    public static String get()
    {
        return local.get();
    }

    public static void set(int year)
    {
        local.set("DB_"+year);
    }

    public static void set(String source)
    {
        local.set(source);
    }

    public  static void restore()
    {
        local.set(DEFAULT_SOURCE);
    }
}
