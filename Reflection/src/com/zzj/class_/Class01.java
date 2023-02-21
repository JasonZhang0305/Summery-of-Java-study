package com.zzj.class_;

import com.zzj.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //classloader
        Cat cat = new Cat();
        Class<?> aClass = Class.forName("com.zzj.Cat");
        //还是通过ClassLoader类加载Cat类的class对象
        //内存中只有一个class的类对象
        Class<?> aClass1 = Class.forName("com.zzj.Cat");
        System.out.println(aClass1.hashCode());
        System.out.println(aClass.hashCode());
    }
}
