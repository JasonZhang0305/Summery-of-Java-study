package com.zzj.classload;

public class ClassLoader01 {
    public static void main(String[] args) throws ClassNotFoundException {
        new B();//类加载
        System.out.println(B.num);//如果直接食用类的静态属性也会导致类加载
        Class<?> b = Class.forName("B");
        /* 在底层有一个同步机制，使得某个类在内存中只有一份Class类对象
        synchronized (getClassLoadingLock(name)) {
        }
         */
    }
}
class B {

    static {
        System.out.println("B静态代码块被执行");
        num = 300;
    }
    static int num = 100;
    public B() {
        System.out.println("B的构造器被执行");
    }
}
