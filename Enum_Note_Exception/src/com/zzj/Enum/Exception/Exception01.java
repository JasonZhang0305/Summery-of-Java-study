package com.zzj.Enum.Exception;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
        }
        //cast exception, 抛出异常之后程序不再执行
        //为了不因为一个小问题就导致程序崩溃，java提供了一个异常处理机制来解决
        System.out.println("Continue");
    }
}
