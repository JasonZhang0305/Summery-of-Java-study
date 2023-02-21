package com.zzj.class_;

import com.zzj.Cat;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        String classAllPath = "com.zzj.Cat";
        Class<?> aClass = Class.forName(classAllPath);
        System.out.println(aClass);
        System.out.println(aClass.getClass());
        //得到包名
        System.out.println(aClass.getPackage().getName());
        //得到类名
        System.out.println(aClass.getName());
        //通过aClass创建对象实例
        Object o = aClass;
        System.out.println(o);
        Field name = aClass.getField("name");


    }
}
