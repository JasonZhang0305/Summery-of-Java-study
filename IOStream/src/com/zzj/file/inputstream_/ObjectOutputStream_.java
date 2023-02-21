package com.zzj.file.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filepath = "/Users/zhejiazhang/Desktop/Programming//Zhang.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
        //反序列化需要与序列化的顺序保持一直
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        ois.close();
    }

}

