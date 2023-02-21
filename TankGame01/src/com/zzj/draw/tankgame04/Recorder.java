package com.zzj.draw.tankgame04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Recorder {
    //定义个变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static String recordFile = "src/record";

    //增加一个方法，当游戏退出时，保存数据到文件
    public static void keepRecord() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
