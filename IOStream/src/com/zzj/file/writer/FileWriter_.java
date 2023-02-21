package com.zzj.file.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/zhejiazhang/Desktop/Programming/Zhang.txt";
        FileWriter fileWriter = null;
        char[] buf = {'z', 'z', 'j'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(buf);
            fileWriter.write("张哲嘉", 0, 1);
            for (int i = 0; i < 100; i++) {
                fileWriter.write("🤔");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
