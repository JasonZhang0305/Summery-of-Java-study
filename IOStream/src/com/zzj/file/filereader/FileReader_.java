package com.zzj.file.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/zzj.txt";
        FileReader fileReader = null;
        int readlen = 0;//读取到的字符数
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            //循环读取字符，read（）返回的是读取到的字符数; 或者,循环读取数组，使用read（buf）返回的是实际读取到的字符数
            while((readlen = fileReader.read(buf)) != -1) {
                System.out.print(readlen);
                System.out.print(new String(buf, 0, readlen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
