package com.zzj.file.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hello");
        PrintWriter printWriter1 = new PrintWriter(new FileWriter("/Users/zhejiazhang/Desktop/Programming/zzj.txt"));
        printWriter1.println("hello, world.");
        printWriter.close();
        printWriter1.close();
    }
}
