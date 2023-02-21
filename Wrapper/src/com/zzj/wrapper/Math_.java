package com.zzj.wrapper;

public class Math_ {
    public static void main(String[] args) {
        int abs = Math.abs(-1);
        System.out.println(abs);
        double n1 = Math.ceil(3.01);
        System.out.println(n1);
        double n2 = Math.floor(3.99);
        System.out.println(n2);
        for (int i = 0; i < 10; i++) {
            System.out.println((int)Math.random());
        }
    }
}
