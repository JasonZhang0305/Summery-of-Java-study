package com.zzj.collection_.List;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //list里的元素是有序的，且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("zzj");
        list.add("zzj");
        System.out.println(list);
    }
}
