package com.zzj.static_.Innerclass.AnonymousInnerClass;

public class AIC {
    public static void main(String[] args) {
        //匿名内部类可以当作实参直接传递，简单高效
        f1(
            new IL(){
            @Override
            public void show() {
                System.out.println("这是一副名画");
                }
            }
        );//匿名内部类此时就被当作一个对象，传入了f1方法里，然后f1方法里
    }
    //一个静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}
