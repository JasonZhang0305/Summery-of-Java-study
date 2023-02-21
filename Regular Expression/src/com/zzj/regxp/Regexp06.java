package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp06 {
    public static void main(String[] args) {
        String content = "我...我要...学学学学...java";
//        String regStr = "(\\d)\\1{4}";//匹配五个连续的相同数字
//        String regStr = "(\\d)(\\d)\\2\\1";//个位与千位相同，十位与百位相同
//        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";//匹配一个 "5位数-xxxyyyzzz" 的数
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");//去掉.
        System.out.println("Initial content = " + content);
        //去掉重复的字
        Pattern pattern1 = Pattern.compile("(.)\\1+");//匹配和第一个找到的内容重复的内容
        Matcher matcher1 = pattern1.matcher(content);
        while (matcher1.find()) {
            System.out.println(matcher1.group(0));
        }
        String content1 = matcher1.replaceAll("$1");//$代表分组的外部反向引用，
        // 找到一个内容，就用这个内容去替代与其重复的内容
        System.out.println("new content = " + content1);

        //使用一条语句去掉重复的汉字
        String content2 = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println("Simplified new content = " + content2);
    }
}
