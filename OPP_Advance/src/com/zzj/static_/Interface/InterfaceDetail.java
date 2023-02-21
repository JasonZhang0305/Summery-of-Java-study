package com.zzj.static_.Interface;

public class InterfaceDetail {
    public static void main(String[] args) {

    }
}
//1 接口不能被实例化
//2 接口中所有方法是public的，抽象的
//3 一个普通类实现接口，就必须将该接口所有方法实现
//4 抽象类可以不实现接口的方法
interface IA {
    void say();
    void hi();
}
class Cat implements IA {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class Tiger implements IA {

}