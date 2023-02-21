package com.zzj.file.outputstream_;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(0.99);
        oos.writeUTF("zzj");
        oos.writeObject(new Dog("旺财", 10));
        oos.close();
        System.out.println("finished");

    }
}

//如果需要序列化某个对象，必须实现serializable接口
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void wang() {
        System.out.println("这是一只狗🐶");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
