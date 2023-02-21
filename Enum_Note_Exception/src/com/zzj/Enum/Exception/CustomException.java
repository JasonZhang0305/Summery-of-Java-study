package com.zzj.Enum.Exception;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18～120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
//自定义异常一般做成运行时异常，即extends RuntimeException
// 好处是我们可以使用默认的处理机制，不用多些一个throw Exception
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}