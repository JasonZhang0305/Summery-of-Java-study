package com.zzj.static_.Innerclass;

public class Innerclass {
    public static void main(String[] args) {
    }
}
class Outer {
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void m1(){
        System.out.println("方法");
    }
    {
        System.out.println("代码块");
    }
    //内部类
    class Inner1 {
        private int n2 = 200;
        public void m2(){
            //局部内部类，可以定义在外部类的方法或代码块里
            //局部内部类可以访问外部类的成员，如果成员重名的
            // 话则默认准守就近原则，如果还是想访问的化就用 类名.this.成员名
            //外部内部类使用内部类时需要创建对象再使用
            class Inner2 {
                private int n2 = 2;
                public void f1(){
                    System.out.println(Inner1.this.n2);
                }
            }
        }

        public void m3() {
            System.out.println("n1=" + n1 + n2);
            m2();
        }
    }
    class Inner3 extends Inner1 {

    }
}
