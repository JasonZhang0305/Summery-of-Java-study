package com.zzj.static_.Interface;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法,在接口中抽象方法可以省略abstract
    default public void hi(){
        System.out.println("ok");
    }
    public static void hello() {
        System.out.println("hello");
    }
}
