package com.zzj.collection_.Map_;

import org.w3c.dom.Node;

import java.util.*;

@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("dc",new Book("",100));
        map.put("dc","sl");//替换上面
        map.put("wbq","mr");
        map.put("sj","mr");
        map.put("lrb",null);
        map.put(null,"lyf");
        map.put("lh","gxt");
        System.out.println("map=" + map);
        //remove根据键删除映射关系
        map.remove(null);
        System.out.println(map);
        //可以通过key找value
        System.out.println(map.get("lh"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
//        map.clear();
        System.out.println(map);
        System.out.println(map.containsKey(null));
        System.out.println("=======");
        //遍历set
        Set keyset = map.keySet();
        for (Object key :keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + "-" + map.get(next));
        }
        //把所有的value取出
        Collection values = map.values();
        for (Object v : values) {
            System.out.println(v);
        }
        //通过entrySet取出
        System.out.println("=====使用EntrySet的方式=====");
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Map.Entry m = (Map.Entry)next;
            System.out.println(m.getKey() + "-" + m.getValue());


        }

    }

}
class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}