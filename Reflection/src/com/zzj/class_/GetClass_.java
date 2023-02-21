package com.zzj.class_;

import com.zzj.Cat;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName
        String classAllPath = "com.zzj.Cat";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        //类名.class 多用于参数传递
        Class<Cat> cls2 = Cat.class;
        System.out.println(cls2);
        //对象.getClass()
        Cat cat = new Cat();
        Class cls3 = cat.getClass();
        System.out.println(cls3);

        //基本数据类型获取Class对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;

    }
}
