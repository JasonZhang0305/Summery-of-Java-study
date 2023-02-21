package com.zzj.collection_.Map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //`Properties extends hashtable
        //store data by k-v, can not be null
        //特点和hashtable差不多
        Properties properties = new Properties();
        properties.put("zzj",23);
        properties.remove("zzj",23);
        //crud共通
    }
}
