package com.zzj.wrapper;

public class StringBuffer01 {
    public static void main(String[] args) {
        //String -> StringBuffer
        String str = "hello";
        //1 constructor
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);
        //2 append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println(stringBuffer1);
        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("zzj");
        //1 toString
        String s = stringBuffer2.toString();
        //2
        String s1 = new String(stringBuffer2);

        int abs = Math.abs(-1);
        System.out.println(abs);

    }
}
