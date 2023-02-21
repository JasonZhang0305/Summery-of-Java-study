package com.zzj.static_.Homework_M;

public class Homework08 {
    public static void main(String[] args) {
        //向上转型：用一个父类的引用指向子类的对象
        People p = new Student();
        p.run();//动态绑定发生，虽然编译类型是父类，
        // 但是作为运行类型子类里也有相同的方法，此时
        // 该对象就会自动调用运行类型里的方法
        p.eat();
        //向下转型：把原本指向子类对象的父类引用转成
        // 指向子类对象的子类引用
        // 此时编译类型就变成了子类的类型，就可以调用子类的方法了
        Student s = (Student) p;
        s.study();
        s.eat();
        s.run();
    }
}
class People {
    public void run(){
        System.out.println("person run");
    }
    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends People {
    public void run() {
        System.out.println("student run");
    }
    public void study() {
        System.out.println("student study...");
    }
}
