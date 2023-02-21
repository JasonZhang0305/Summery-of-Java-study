package com.zzj.collection_.List;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        //Vector是线程同步的，即线程安全
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        //源码解读
        //1 new Vector（）走无参构造器的话，就会自动先给10个capacity
        //2 如果是有参构造器，就按照参数给capacity，如果满了的话每次按照2倍扩容
    }
}
