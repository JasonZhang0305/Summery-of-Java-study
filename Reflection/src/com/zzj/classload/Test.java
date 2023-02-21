package com.zzj.classload;

import com.zzj.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}
class A {
    //n1 是实例属性，不是静态的，因此在准备阶段不会分配内存
    //n2 是静态变量，分配内存，默认初始化为0
    //n3 是常量，一旦赋值就不变化了，初始化就是30
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}