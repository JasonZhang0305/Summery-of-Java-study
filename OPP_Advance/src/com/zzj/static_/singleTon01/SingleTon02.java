package com.zzj.static_.singleTon01;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
    }
}
//希望在程序运行过程中只能创建一个cat对象
class Cat {
    private String name;
    //【单例模式】【懒汉式】：调用instance时才开始创建一个instance
    //但是存在线程安全问题
    //1 构造器私有化，外部就没办法创建对象
    //2 定义一个static对象
    //3 提供一个public static method可以返回一个Cat对象
    //4 懒汉式只有用户使用getInstance才返回cat对象，再次
    //调用会返回上次创建了的对象，从而保证单例
    private static Cat cat;
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("Cute");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
