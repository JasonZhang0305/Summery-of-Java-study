package com.zzj.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info() {
        File file = new File("/Users/zhejiazhang/Desktop/Programming/");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}

