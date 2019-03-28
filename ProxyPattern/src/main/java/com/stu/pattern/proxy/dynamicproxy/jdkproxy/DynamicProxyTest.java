package com.stu.pattern.proxy.dynamicproxy.jdkproxy;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        try {
            IMovieStar movieStar = (IMovieStar) new BrokerDynamicProxy().getInstance(new MaleMovieStar("刘德华"));
            movieStar.perform();

         /*   byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IMovieStar.class});
            FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
            fos.write(bytes);
            fos.close();
            System.out.println("=================================");
            ISingStar singStar = (ISingStar)new DynamicProxy().getInstance(new MaleSinger("周杰伦"));
            singStar.sing();

            byte[] bytes1 = ProxyGenerator.generateProxyClass("$Proxy1", new Class[]{ISingStar.class});
            FileOutputStream fos1 = new FileOutputStream("E://$Proxy1.class");
            fos1.write(bytes1);
            fos1.close();*/
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
