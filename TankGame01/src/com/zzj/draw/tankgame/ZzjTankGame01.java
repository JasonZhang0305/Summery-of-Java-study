package com.zzj.draw.tankgame;

import javax.swing.*;

public class ZzjTankGame01 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzjTankGame01 zzjTankGame01 = new ZzjTankGame01();
    }
    public ZzjTankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
