package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
正则表达式是处理文本的利器
对字符串执行模式匹配
 */
public class Regxp_ {
    public static void main(String[] args) {
        String content = "正则表达式1，又称规则表达式," +
        "（Regular Expression，在代码2中常简写为regex、regexp或RE），" +
        "是一种文本模式3，包括普通字符（例如，a 到 z 之间的字母）和特殊字符4" +
        "（称为'元字符')";
        Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(content);
//        理解：matcher匹配器按照pattern（模式/样式），到content文本中去匹配
//        找到就返回true，否则就返回false
        while (matcher.find()) {
            //匹配内容，文本，放到m.group（0）
            System.out.println(matcher.group(0));
        }
    }
}
