package com.zzj.collection_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",1650);
        System.out.println(m);
        m.put("jack",2600);
        System.out.println(m);
        Set set = m.keySet();
        for (Object key : set) {
            m.put(key,(Integer)m.get(key) + 100);
        }
        System.out.println(m);
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
