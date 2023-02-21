package com.zzj.file.writer;

import java.io.*;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        //BufferReader/Writer 是操作二进制文件，如果操作可能会造成文件损坏
        String filePath = "/Users/zhejiazhang/Desktop/Programming/java.txt";
        String desFilePath = "/Users/zhejiazhang/Desktop/Programming/zzj.txt";
        String line;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello1, zzj");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2, zzj");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3, zzj");
        bufferedWriter.newLine();
        bufferedWriter.close();
        BufferedReader br = null;
        BufferedWriter bw = null;
        br = new BufferedReader(new FileReader(filePath));
        bw = new BufferedWriter(new FileWriter(desFilePath));
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
