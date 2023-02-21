package com.zzj.file.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_0 {
    public static void main(String[] args) {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/zzj.txt";
        FileReader fileReader = null;
        char data = ' ';//读取到的字符数
        try {
            fileReader = new FileReader(filePath);
            //循环读取单个字符，read（）返回的是读取到的字符数; 或者,循环读取数组，使用read（buf）返回的是实际读取到的字符数
            while((data = (char) fileReader.read()) != -1) {
                System.out.print(data);
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
