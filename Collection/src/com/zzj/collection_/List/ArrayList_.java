package com.zzj.collection_.List;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        //使用午餐构造器创建ArrayList对象
        ArrayList list = new ArrayList(8);
        for (int i = 1; i <= 10 ; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15 ; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        System.out.println(list);
    }
}

