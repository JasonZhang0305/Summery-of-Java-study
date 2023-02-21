package com.zzj.regxp;

public class Regex07 {
    public static void main(String[] args) {
        String content = "jdk1.3, jdk1.4于2000年5月相继发布。";
        content = content.replaceAll("jdk1\\.4|3", "jdk");//正则表达式也可以直接写在这
        System.out.println("new content = " + content);
        String content2 = "19910656213";
        //匹配： matches()方法
        if (content2.matches("1(38|39)\\d{8}")) {
            System.out.println("succeeded");
        } else {
            System.out.println("failed");
        }
        //分割 split()
        String content3 = "hello.zzj-japan¥tokyo";
        String[] split = content3.split("¥|-|\\.");
        for(String s : split) {
            System.out.println("splitted content = " + s);
        }
    }
}
