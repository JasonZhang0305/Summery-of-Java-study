package com.zzj.wrapper;

public class Wrapper02 {
    public static void main(String[] args) {
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//查看源码 没有new一个对象
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//new 了一个对象
    }
}
