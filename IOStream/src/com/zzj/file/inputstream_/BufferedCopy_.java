package com.zzj.file.inputstream_;

import java.io.*;

/**
 * BufferedOutputStream & BufferedInputStream可以按照二进制拷贝文件，
 * 当然也可以操作一个文本文件
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "/Users/zhejiazhang/Desktop/Programming/Learning Route.jpeg";
        String destFilePath = "/Users/zhejiazhang/Desktop/Programming/zzj/Study.jpeg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        byte[] buff = new byte[1024];
        int readln = 0;
        while((readln = bis.read(buff)) != -1) {
            bos.write(buff, 0, readln);
        }
        if (bos != null) {
            bos.flush();
        }
    }
}
