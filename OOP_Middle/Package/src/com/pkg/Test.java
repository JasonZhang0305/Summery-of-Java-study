package com.pkg;

import com.zzj.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);//不同包下只能访问public修饰的属性或方法
    }
}
