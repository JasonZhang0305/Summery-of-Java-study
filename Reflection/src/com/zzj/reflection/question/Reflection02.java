package com.zzj.reflection.question;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) {

    }
    @Test
    public void api_2() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("com.zzj.reflection.question.Person");
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()
            + declaredField.getModifiers() + "该属性的类型" + declaredField.getType());
        }
    }
    @Test
    public void api_01() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("com.zzj.reflection.question.Person");
        System.out.println(personCls.getName());
        System.out.println(personCls.getSimpleName());
        Field[] fields = personCls.getFields();//可以获取本类及父类的public fields
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        Method[] methods = personCls.getMethods();//超类的方法都可以拿到
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Package aPackage = personCls.getPackage();
        System.out.println(aPackage.getName());
    }
}
class A {
    public String hobby;
    public void hi() {}
}
class Person extends A {
    public String name;
    protected static int age;
    String job;
    public double sal;
    public void m1() {}
}
