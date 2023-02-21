package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp03 {
    public static void main(String[] args) {
        String content = "zzj01 zzj02 zzj03 11111";
        //命名分组
//        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
//        String regStr = "zzj(?:01|02|03)";
//        String regStr = "zzj(?=01|02|03)";
//        String regStr = "zzj(?!01|02)";
        String regStr = "\\d+";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println("find = " + matcher.group(0));
//            System.out.println("find = " + matcher.group("g2"));
        }
    }
}
