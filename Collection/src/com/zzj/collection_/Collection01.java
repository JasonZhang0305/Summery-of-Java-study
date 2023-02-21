package com.zzj.collection_;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        //集合分两种，单列和双列
        //Collection 接口有两个重要的自接口 List Set，他们的实现子类都是单列集合
        //Map时双列集合
    	
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(10);
        List list2 = new ArrayList();
        list2.add("zzj");
        list2.add("zjj");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2.isEmpty());
        System.out.println(list.contains("zzj"));
        list.removeAll(list2);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        
        int m = 10;
        int n = 4;
        System.out.println(m/n);
    }
}
