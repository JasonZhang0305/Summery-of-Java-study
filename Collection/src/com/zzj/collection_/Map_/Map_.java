package com.zzj.collection_.Map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        //Map与Collection并列存在，用于保存具有映射关系的数据
        //Key-Value
        //key是唯一的,是Object类型
        Map map = new HashMap();
        map.put("no1", "zzj");
        map.put("no2", "hsp");
        map.put("no1", "zsf");//出现相同的元素时会替换前面的
        map.put("no3", "zsf");
        map.put(null,null);
        map.put("no4",null);
        map.put(1,null);
        map.put(new Object(),"lalala");
        System.out.println(map);
        System.out.println(map.get(null));//get()方法里输入key，返回value
    }
}
