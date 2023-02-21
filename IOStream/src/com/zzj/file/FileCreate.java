package com.zzj.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void create01() {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/zzj.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方式2
    @Test
    public void create02() {
        File file = new File("/Users/zhejiazhang/Desktop/Programming");
        String fileName = "zzj.pdf";
        File file1 = new File(file, fileName);
        try {
            file1.createNewFile();//只有执行了这个方法，才会真正再磁盘里创建该文件
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方式3
    @Test
    public void create03() {
        String parentPath = "/Users/zhejiazhang/Desktop/Programming";
        String fileName = "zzj.word";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
