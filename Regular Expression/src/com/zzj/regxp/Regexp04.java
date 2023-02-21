package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp04 {
    public static void main(String[] args) {
        String content = "18810656213";
//        汉字
//        String regStr = "^[\u0391-\uffe5]+$";
//        邮政编码
//        String regStr = "^[1-9]\\d{4,10}$";
        String regStr = "^1[3|4|5|8]\\d{9}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("satisfied");
        } else {
            System.out.println("unsatisfied");
        }
    }
}
