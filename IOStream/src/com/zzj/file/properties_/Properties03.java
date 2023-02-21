package com.zzj.file.properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //如果该文件没有key，就是创建
        //如果该文件有key，就是修改
        //底层是hashtable，
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "tom");//汉字的话会穿unicode码
        properties.setProperty("pwd", "888");
        properties.setProperty("id", "777");
        //将k-v存储到文件中
        properties.store(new FileOutputStream("src/mysql.properties"), "@zzj");//后面可以加个注解
        System.out.println("保存成功～");
    }
}
