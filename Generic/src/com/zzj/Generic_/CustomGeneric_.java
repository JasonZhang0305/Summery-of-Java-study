package com.zzj.Generic_;

import java.util.Arrays;

public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> zzj = new Tiger<>("zzj");
        zzj.setT(10.9);
//        zzj.set("zzj");//错误
        System.out.println(zzj);
        Tiger hsp = new Tiger("hsp");//此时泛型里默认填的就是Object
        hsp.setT("yy");
        System.out.println(hsp);
    }
}
class Tiger<T,R,M> {
    String name;
    R r;
    M m;
    T t;
    T[] ts;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}
