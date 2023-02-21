package com.zzj.collection_.Set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        //set接口对象，不能存放重复的元素，可以添加一个null
        //set接口对象存放数据是无序的
        //取出顺序虽然不是添加顺序，但却是固定的
        Set set = new HashSet();
        set.add("zzj");
        set.add("jack");
        set.add("tom");
        set.add("mary");
        set.add(null);
        set.add(null);
        System.out.println(set);
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println(set.toArray());
    }
}
