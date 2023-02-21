package com.zzj.Generic_;

import java.sql.Array;
import java.util.ArrayList;

public class Details_ {
    public static void main(String[] args) {
        //1 只能时引用类型，不能是基本类型
        // new ArrayList<int>() 不可
        //2 在给范型指定类型后可以传入该类型，或者其子类型
        Pig<A> aPig = new Pig<A>(new B());
        //实际开发中，可以简写
        //编译器会进行类型推断
        ArrayList<Pig> pigs = new ArrayList<>();
        pigs.add(aPig);
        ArrayList arrayList = new ArrayList();//没有写默认是<Object>

    }
}
class A {}
class B extends A {}

class Pig<E> {
    E n;

    public Pig(E n) {
        this.n = n;
    }
}