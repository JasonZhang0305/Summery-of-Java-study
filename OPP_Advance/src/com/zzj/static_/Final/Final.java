package com.zzj.static_.Final;

public class Final {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        //包装类，String是final类，不能被继承
    }
}

class BBB {
    public final static int num = 1000;
    static {
        System.out.println("BBB静态代码块被执行");
    }
}
final class AAA{

}
