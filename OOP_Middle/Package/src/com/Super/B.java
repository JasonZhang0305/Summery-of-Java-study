package com.Super;

public class B extends A{

   public void test() {
       System.out.println(super.n1);//super不仅限于父类查找，可以一直向上查找
   }
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void cal() {
        System.out.println(("B类的cal()方法"));
    }
    public void sum() {
        System.out.println("B类的sum()");
        /*
        希望调用父类A的cal方法，因为子类B没有，因此可以使用一下三种方式
        找cal方法的顺序是：
        （1）先找本类，如果有则直接调用
        （2）如果没有则找父类
        （3）如果父类也没有则继续找父类的父类，直到Object类
        提示：如果在查找过程中，找到了但不能访问则报错
             如果没有找到，则提示方法不存在
         */
        this.cal();//等价 cal
        super.cal();//直接去父类查找cal方法
    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //不能访问父类private方法
    }
    //
    public B() {
        super();
    }
}
