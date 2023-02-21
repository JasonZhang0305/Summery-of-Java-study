package com.zzj.file.homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "src/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        //properties.get()方法返回的都是对象，所以需要转型
        String name = properties.get("name") + "";
        double age = Double.parseDouble(properties.get("age") + "");//Object -> String -> int
        String color = properties.get("color") + "";

        Dog dog = new Dog(name, age, color);
        System.out.println("====");
        System.out.println(dog);

        String serFilePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("序列化结束");
        m1();
    }
    public static void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();
        System.out.println("========");
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable {
    private String name;
    private double age;
    private String color;

    public Dog(String name, double age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void dog() {
        System.out.println("wang~");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}