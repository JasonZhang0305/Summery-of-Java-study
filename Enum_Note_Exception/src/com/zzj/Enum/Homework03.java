package com.zzj.Enum;

public class Homework03 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A {
    private String name = "hello";
    public void f1(){
        class B {
            private final String NAME = "zzj";
            public void show() {
                System.out.println("NAME=" + NAME + ", 外部类的name=" + name);
            }
        }
        new B().show();//外部类要创建对象才能调用内部类的方法
    }
}
