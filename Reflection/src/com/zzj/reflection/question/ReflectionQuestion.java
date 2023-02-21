package com.zzj.reflection.question;

import com.zzj.Cat;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //根据配置文件re.properties指定信息，创建Cat对象并调用方法hi
        //使用Properties类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        //创建对象的传统方法行不通
        // 要用reflection来解决
        Class aClass = Class.forName(classfullpath);
        //通过aClass得到加载类的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());
        //在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = aClass.getMethod(method);
        //通过方法类的方法对象来调用方法
        method1.invoke(o);
        //在不动这里的源码的情况下，将调用hi方法，转成调用cry方法
        //只需要在配置文件中，将method方法从hi改为cry
        Field nameField = aClass.getField("age");
        System.out.println(nameField.get(o));
        Constructor constructor = aClass.getConstructor();
        System.out.println(constructor);
        Constructor constructor1 = aClass.getConstructor(String.class);//String 类的class对象
        System.out.println(constructor1);


    }
}
