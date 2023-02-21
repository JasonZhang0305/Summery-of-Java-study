package com.debug;

//debug对象创建的过程，加深对调试的理解
public class Debug05 {
    public static void main(String[] args) {
        //创建流程
        //1 加载Person类信息
        //2 初始化： 默认初始化 - 显示初始化 - 构造器初始化
        //3 返回对象的地址
        Person jacky = new Person("jacky", 20);
        System.out.println(jacky);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
