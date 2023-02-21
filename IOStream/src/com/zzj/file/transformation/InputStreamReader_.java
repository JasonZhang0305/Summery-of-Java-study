package com.zzj.file.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 将字节流转换成字符流，并指定编码
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "unicode");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
