package com.zzj.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //Integer -> String
        Integer i = 100;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);
        //String -> Integer
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);
    }
}
