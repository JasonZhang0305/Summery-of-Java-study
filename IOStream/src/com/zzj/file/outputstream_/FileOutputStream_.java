package com.zzj.file.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() {
        //创建FileOutputStream对象
        String filePath = "/Users/zhejiazhang/Desktop/Programming/zzj.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //new FileOutputStream(filePath);创建方式写入内容后 会覆盖原内容
            //new FileOutputStream(filePath, true) 就不会覆盖
            fileOutputStream = new FileOutputStream(filePath, true);
            String str = "zzj";
            fileOutputStream.write(str.getBytes(),0, 1);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

