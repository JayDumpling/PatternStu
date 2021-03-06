package com.stu.pattern.prototype.deep;

import java.io.*;
import java.rmi.server.ExportException;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public Jingubang jingubang;

    public QiTianDaSheng()
    {
        this.height = "1.8m";
        this.weight = "130g";
        this.birthday = new Date();
        this.jingubang = new Jingubang();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    public Object deepClone()
    {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();

            bos.close();
            oos.close();
            bis.close();
            ois.close();
            return copy;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public Object shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }
}
