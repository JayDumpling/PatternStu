package com.stu.pattern.prototype.simple;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototypeA concretePrototypeA1 = new ConcretePrototypeA();
        concretePrototypeA1.setAge("20");
        concretePrototypeA1.setName("小明");
        concretePrototypeA1.setBirthday(new Date(21322212));
        System.out.println(concretePrototypeA1);
        ConcretePrototypeA concretePrototypeA2 = (ConcretePrototypeA) concretePrototypeA1.clone();
        System.out.println(concretePrototypeA2);
        System.out.println(concretePrototypeA1 == concretePrototypeA2);
        System.out.println(concretePrototypeA1.getBirthday() == concretePrototypeA2.getBirthday());
        concretePrototypeA2.getBirthday().setTime(55455544L);
        System.out.println(concretePrototypeA1);
        System.out.println(concretePrototypeA2);

    }
}
