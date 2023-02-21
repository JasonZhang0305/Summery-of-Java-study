package com.zzj.collection_.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zzj");
        list.add("jzz");
        list.add(1,"zjz");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("zzz");
        list2.add("jjj");
        list.addAll(1,list2);
        System.out.println(list);
        list.set(4,"zjj");//replace
        System.out.println(list);
        System.out.println(list.subList(0,2));
    }
}
