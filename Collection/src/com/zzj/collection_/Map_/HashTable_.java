package com.zzj.collection_.Map_;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_ {
    public static void main(String[] args) {
        //hushTable的键值不能为bull
        //是线程安全的（synchronized）
        //底层有个数组 Hashtable$Entry[] 初始化大小为11
        //threshold为8 = 11*0。75
        Hashtable hashtable = new Hashtable();
        hashtable.put("zzj",23);
        hashtable.put("zjj",24);
        hashtable.put("zzj",21);

    }
}
