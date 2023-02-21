package com.zzj.collection_.Set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        //用无参构造器创建时是无序的
        //可以用TreeSet提供的一个构造器，传入一个比较器（匿名内部类）
        //并指定排序规则
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);//字符串比较
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println(treeSet);
    }
}
