package com.zzj.regxp;

import java.util.regex.Pattern;

public class Regexp05 {
    public static void main(String[] args) {
        String content = "hello abc hello, zzj";
//        String regStr = "hello";
        String regStr = "hello.*";
        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配" + matches);
    }
}
