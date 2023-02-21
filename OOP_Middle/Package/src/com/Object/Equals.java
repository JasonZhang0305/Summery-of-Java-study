package com.Object;

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A c = a;
        System.out.println(a == c);
        System.out.println(a == b);
        B bObj = a;
        System.out.println(bObj == c);

        "hello".equals("abc");
        System.out.println(a.getClass());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());



    }
}
class A extends B {}
class B {}
