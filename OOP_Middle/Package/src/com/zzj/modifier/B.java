package com.zzj.modifier;

public class B {
    public void say() {
        A a = new A();
        //在同包不同类下，可以访问，public , protected, 和默认，不能访问private
        System.out.println(a.n1);//public
        System.out.println(a.n2);//protected
        System.out.println(a.n3);//default
    }
}
