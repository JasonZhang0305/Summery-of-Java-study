package com.zzj.draw.tankgame03;

import javax.swing.*;

public class ZzjTankGame03 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzjTankGame03 zzjTankGame03 = new ZzjTankGame03();
    }
    public ZzjTankGame03() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1200,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
