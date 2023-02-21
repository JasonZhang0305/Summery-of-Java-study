package com.zzj.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //jdk5前时手动装箱 int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱 Integer -> int
        int i = integer.intValue();
        System.out.println(Integer.reverse(123));




        //jdk5之后可以自动装箱和拆箱
        int n2 = 200;
        //自动装箱 int -> Integer
        Integer integer2 = n2; //底层依旧要执行Integer.valueOf(n1)
        //自动拆箱 Integer -> int
        int n3 = integer2;
    }
}
