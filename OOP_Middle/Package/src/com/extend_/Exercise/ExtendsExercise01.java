package com.extend_.Exercise;
//有点晕

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();//怎么没有print还能输出结果？

        //System.out.println(b);
    }
}
class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");//这是什么
        System.out.println("b");
    }
    B(String name) {
        super();//为什么默认有这个构造器
        System.out.println("b name");
    }
}