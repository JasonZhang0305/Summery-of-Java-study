package com.zzj.reflection.question;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> userClass = Class.forName("com.zzj.reflection.question.ReflectionCreateInstance");
        Constructor<?> constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);//使用反射可以访问private构造器
        Object zzj = constructor.newInstance(100, "zzj");
        System.out.println(zzj);

    }
}
class User {
    private int age;
    private String name;
    public User() {
    }
    public User(String name) {
    }
    private User(int age, String name) {
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
