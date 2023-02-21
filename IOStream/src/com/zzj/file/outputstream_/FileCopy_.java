package com.zzj.file.outputstream_;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopy_ {
    public static void main(String[] args) {
        //文件拷贝
        //创建文件的输入流 文件-java内存
        //创建文件的输出流 java内存-文件

        String scrFilePath = "/Users/zhejiazhang/Desktop/Programming/Learning Route.jpeg";
        String destFilePath = "/Users/zhejiazhang/Desktop/Programming/zzj/Learning Route.jpeg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(scrFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readlen);
            }
            System.out.println("拷贝ok");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
