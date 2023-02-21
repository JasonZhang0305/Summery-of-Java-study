package com.zzj.file.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        //按行读取文件，当返回null时表示文件读取完毕
        while((line = bufferedReader.readLine())!= null) {
            System.out.println(line);
        }
        //只需要关闭包装流即可，底层会自动去关闭节点流
        bufferedReader.close();
    }
}
