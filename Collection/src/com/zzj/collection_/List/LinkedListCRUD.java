package com.zzj.collection_.List;

import java.util.Iterator;
import java.util.LinkedList;
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.remove();//无参默认删除第一个
        System.out.println(linkedList);
        linkedList.set(0,999);
        System.out.println(linkedList);
        Object o = linkedList.get(1);
        System.out.println(o);
        //遍历输出
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
        for (Object o1 :linkedList) {
            System.out.println("o1=" + o1);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        //源码解读
        //先调无参构造器，first = null，last = null
        //执行了一个add方法 linkLast
    }
}
