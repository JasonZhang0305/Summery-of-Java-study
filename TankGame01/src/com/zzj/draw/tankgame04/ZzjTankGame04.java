package com.zzj.draw.tankgame04;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ZzjTankGame04 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzjTankGame04 zzjTankGame04 = new ZzjTankGame04();
    }
    public ZzjTankGame04() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1200,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);

            }
        });

    }
}
