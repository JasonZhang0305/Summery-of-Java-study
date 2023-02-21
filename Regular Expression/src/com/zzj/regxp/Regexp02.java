package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp02 {
    /*
    * []可接收的字符列表
    * [^]不接收的字符列表
    *
    *
     */
    public static void main(String[] args) {
        String content = "aahhaa aa aa";
//        String regStr = "\\d{2}";
//        String regStr = "a{3,4}";//贪婪匹配，尽可能匹配多的
//        String regStr = "1+"; // + 是匹配一个或多个
//        String regStr = "1*";//* 匹配0个1或者多个1
//        String regStr = "a1?"; //? 匹配a或者a1
//        String regStr = "^[0-9]+[a-z]*"//必须以0-9开头;
//        String regStr = "^[0-9]+\\-[a-z]+$";
//        String regStr = "aa\\b";//找到边界的aa
        String regStr = "aa\\B";//找到开始的aa
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);//不区分大小写
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("output = " + matcher.group(0));
        }
    }
}
