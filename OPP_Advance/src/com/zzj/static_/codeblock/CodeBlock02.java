package com.zzj.static_.codeblock;
//执行顺序
//先加载类，static的属性代码块都会被调用
//再加载对象，对象的属性代码块和构造器都会被调用
public class CodeBlock02 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {
    private static int a = getVal01();
    private int aa = getVal11();
    static{
        System.out.println("AAA的static代码块被调用");
    }
    {
        System.out.println("AAA的普通代码块被调用");
    }
    public AAA() {
        //3.super();无
        //4.调用本类普通代码块和属性
        System.out.println("AAA()构造器被调用...");
    }
    public static int getVal01() {
        System.out.println("static field a 已被初始化");
        return 10;
    }
    public int getVal11() {
        System.out.println("field aa 已被初始化");
        return 10;
    }
}
class BBB extends AAA {
    private static int b = getVal02();
    private int bb = getVal22();
    static{
        System.out.println("BBB的static代码块被调用");
    }
    {
        System.out.println("BBB的普通代码块被调用");
    }
    public BBB() {
        //1.super();
        //2.调用本类普通代码块和普通属性
        System.out.println("BBB的构造器被调用");
    }
    public static int getVal02() {
        System.out.println("static field b 已被初始化");
        return 20;
    }
    public int getVal22() {
        System.out.println("field bb 已被初始化");
        return 20;
    }
}