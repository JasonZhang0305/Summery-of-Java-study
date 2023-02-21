package com.zzj.static_.Innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        //外部其他类访问静态内部类,静态的可以通过类名直接访问
        Outer05.Inner05 inner05 = new Outer05.Inner05();
        inner05.say();
        //2
        //编写一个方法，可以返回一个静态内部类的实例
        new Outer05().getInner05Instance().hi();
    }
}
class Outer05 {
    private static int n1 = 10;
    private static String name = "zzj";
    private static void cry() {}
    //static inner class
    //1 放在成员位置，用static修饰
    //3 可以直接访问外部类的所有静态成员，包含私有的，但不能访问非静态的成员
    //4 可以附加任意修饰符
    //5 作用域：是类里的一部分
    static class Inner05 {
        //就近原则,static不用加this
        private static String name = "jjj";
        public void say() {
            System.out.println(Outer05.name);
            cry();
        }
        public void hi() {
            System.out.println(n1);
        }
    }
    public Inner05 getInner05Instance() {
        return new Inner05();
    }
}
