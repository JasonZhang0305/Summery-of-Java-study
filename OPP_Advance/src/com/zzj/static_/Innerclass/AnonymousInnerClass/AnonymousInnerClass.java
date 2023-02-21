package com.zzj.static_.Innerclass.AnonymousInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        //1 需求：想使用IA接口，并创建对象
        //2 传统方式，写一个类，实现该接口，并创建对象
        //3 需求new：需要两个只用一次的类
        //4 可以匿名内部类来简化开发，不创建Tiger类也能实现"老虎叫"的方法
        //5 tiger的编译类型是IAA，运行类型是匿名内部类
        /*  底层有这么一个逻辑
            class Outer04$1 implements IAA {
            @Override
            public void cry() {
                System.out.println("老虎在叫。。。");
                }
            }
        */
        //7 jdk底层创建了一个内部类Outer04$1之后立刻就创建了Outer04$1的实例，并将实例的地址返回给了tiger
        //8 匿名内部类只能使用一次
        IAA tiger = new IAA() {
            @Override
            public void cry() {
                System.out.println("老虎在叫。。。");
            }
        };
        System.out.println("tiger的运行类型为" + tiger.getClass());
        tiger.cry();
//        IAA tiger = new Tiger();
//        tiger.cry();

        //基于类的匿名内部类
        //1 father编译类型为Father
        //2 father运行类型为Outer04$2
        //3 jdk底层会创造一个Outer04$2类，并让它继承Father类
        //4 jdk底层创建了一个内部类Outer04$2之后立刻就创建了它的实例，并将其地址返回给了zzj
        Father zzj = new Father("ZZJ"){
            private String name = "zzj";
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
                System.out.println(super.name);// 加super这里会调用其父类的属性，不加的话就调自己的
            }
        };
//        System.out.println("father的运行类型为" + zzj.getClass());
        zzj.test();
    }
}
interface IAA {
    public void cry();
}
//   class Tiger implements IAA {
//
//    @Override
//    public void cry() {
//        System.out.println("老虎在叫。。。");
//    }
//}
class Father {
    public String name;
    public Father(String name) {
        this.name = name;
    }
    public void test(){}
}
