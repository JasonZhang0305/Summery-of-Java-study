package com.zzj.collection_.Set;

import com.zzj.collection_.List.LinkedList_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        //是有序的
        //有一个linkedhashmap子类
        //
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("liu",1001));
        set.add(123);
        set.add("zzj");
        System.out.println(set);

    }
}
class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
