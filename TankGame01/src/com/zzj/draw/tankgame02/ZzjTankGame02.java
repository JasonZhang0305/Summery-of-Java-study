package com.zzj.draw.tankgame02;

import javax.swing.*;

public class ZzjTankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzjTankGame02 zzjTankGame01 = new ZzjTankGame02();
    }
    public ZzjTankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
