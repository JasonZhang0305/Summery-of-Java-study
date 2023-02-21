package com.zzj.collection_.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        System.out.println("=====增强for=====");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
