package com.zzj.file.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/zhejiazhang/Desktop/Programming";
        File file = new File(directoryPath);
        if (!file.exists()) {
            System.out.println("创建成功");
            if (file.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
        String filePath = directoryPath + "/ZhangZhejia.txt";
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("succeed");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello, zzj~");
                bufferedWriter.close();
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("This file is existing.");
        }
    }
}
