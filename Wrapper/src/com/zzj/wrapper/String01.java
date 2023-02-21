package com.zzj.wrapper;

public class String01 {
    public static void main(String[] args) {
        //有很多构造器可以用
        //String类实现了很多接口，Serializable 串行化：可以在网络传输
        //Comparable String对象可以比较大小
        //String有属性，private final char value[] 用于存放字符串内容, String 的本质就是Char[]
        //一定要注意：value是一个final类型的，地址不可修改
        String name = "jack";
        final char[] value = {'z', 'b', 'c'};
        value[0] = '0';
        String name1 = "jack";
        System.out.println(name == name1);

        //Exercise02
        System.out.println("=======");
        String a = "zzj";//a直接指向常量池
        String b = new String("zzj");//b指向堆中的一个对象然后再指向常量池中的"zzj"
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//地址不一样 F
        System.out.println(a == b.intern());//b.intern()指向常量池 T
        //intern方法会去常量池里找是否有与b对象相同的字符串，
        //如果有，就返回常量池中的字符串，如果没有则将此对象添加到池中，并返回引用
        System.out.println(b == b.intern());//b指向堆的 T

        //Exercise02
        System.out.println("=======");
        System.out.println("zzj".hashCode());//String直接指向常量池

        //Exercise
        String aa = "hello";
        String bb = "hi";
        String cc = aa + bb;

    }
}
