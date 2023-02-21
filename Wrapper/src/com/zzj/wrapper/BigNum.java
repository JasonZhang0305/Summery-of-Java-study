package com.zzj.wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {
    public static void main(String[] args) {
        //整数太大，你忍一下～
//        long l = 2176498317498037848383833388888888888889l;
        //用BigInteger来处理
        BigInteger bigInteger = new BigInteger("2176498317498037848383833388888888888889");
        System.out.println(bigInteger);
        //运算用BigInteger的方法
        BigInteger bigInteger1 = new BigInteger("28173982173291793892");
        BigInteger add = bigInteger.add(bigInteger1);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        //BigDecimal同理
        BigDecimal bigDecimal = new BigDecimal("0.2817312739821748912378493718397821937219878389");
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        //加减乘 同上
        //除法可能会引发无限循环小数
        System.out.println(bigDecimal.divide(bigDecimal1));

    }
}
