package com.stu.pattern.prototype.simple;

import java.util.Date;

public class ConcretePrototypeA implements Cloneable{
    private String name;
    private String age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        ConcretePrototypeA cloneObj = (ConcretePrototypeA)obj;
        cloneObj.birthday = (Date) this.birthday.clone();
        return obj;
    }


}
