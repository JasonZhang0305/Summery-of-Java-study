package com.zzj.reflection.question;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAM {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.zzj.reflection.question.ReflectionAM");
        Method hi = bossCls.getDeclaredMethod("hi",String.class);
        hi.invoke(bossCls,"zzj");

    }
}
class Boss {
    public int age;
    private static String name;

    public Boss() {
    }
    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }
    public void hi(String s) {
        System.out.println("hi " + s);
    }
}