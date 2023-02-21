package com.zzj.static_.Innerclass;

public class MemberInnerclass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.t1();
        //外部其他类使用内部类有三种方法
        //1 在外部类的对象里再new一个内部类的对象
        Outer04.Inner04 inner04 = outer04.new Inner04();
        //2 在外部类中编写一个方法，返回内部类的instance
        Outer04.Inner04 inner04Instance = outer04.getInner04Instance();
        inner04Instance.say();


    }
}

class Outer04 {
    private int n1 = 10;
    public String name = "zzj";
    public void hi(){
        System.out.println("hi()method");
    }
    //1 成员内部类，定义在成员位置上
    //2 前面可以添加任意访问修饰符
    class Inner04{
        //如果内部类的属性和外部类的重合了，则遵循就近原则，如果还
        // 是想调用外部类的属性，则用外部类名.this. 来调用
        private int n1 = 66;
        public String name = "zzz";
        public void say() {
            System.out.println("My name is " + Outer04.this.name);
            //3 成员内部类使用外部类的方法或属性的话直接用即可
            hi();
        }
    }
    public void t1() {
        //4 外部类要使用成员内部类的话就要调用相关方法
        Inner04 inner04 = new Inner04();
        inner04.say();
    }
    public Inner04 getInner04Instance(){
        return new Inner04();
    }
}
