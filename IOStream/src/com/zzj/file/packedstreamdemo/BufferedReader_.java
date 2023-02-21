package com.zzj.file.packedstreamdemo;

/**
 * 包装流
 */
public class BufferedReader_ extends Reader_ {
    private Reader_ reader_;
    //可以接受Reader_子类的对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFile() {
        reader_.readFile();
    }
    //让方法更加灵活，多次读取文件，或者加缓冲
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
