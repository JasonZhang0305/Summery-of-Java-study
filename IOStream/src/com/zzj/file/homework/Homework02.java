package com.zzj.file.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/java.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null;
        int count = 0;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(++count + "-" + line );
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }
}
