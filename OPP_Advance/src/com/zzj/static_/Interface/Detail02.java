package com.zzj.static_.Interface;
//一个类可以实现多个接口
public class Detail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);// n1 is static
        //IB.n1 = 30; n1 is final

    }
}
interface IB {
    int n1 = 10;//等价于public static final int n1
    void hi();
}
interface IC {
    void hello();
}
interface ID extends IB,IC {
    //接口不能继承其他类，但是可以继承多个别的接口
}

class Pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void hello() {

    }
}
