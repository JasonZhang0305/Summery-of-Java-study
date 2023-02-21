package com.zzj.wrapper;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(date);
        System.out.println("Today is " + format);
        Instant now = Instant.now();
        System.out.println(now);

        String name = "Zhang Zhe jia";
        printName(name);
    }
    public static void printName(String str) {
        if (str == null) {
            System.out.println("!!");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("格式不对");
            return;
        }
        String format = String.format("%s%s %c.", names[1],names[2],names[0].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
