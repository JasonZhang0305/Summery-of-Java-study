package com.zzj.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private  MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
      mp = new MyPanel();
      this.add(mp);
      this.setSize(400,300);
      //关闭窗口可推出程序
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
}
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawOval(10,10,100,100);

        //演示画出不同的图形
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,100);
//        g.setColor(Color.blue);
//        g.fillRect(10,10,100,100);
//        g.setColor(Color.red);
//        g.fillOval(10,10,10,100);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("\\ Route.jpeg"));
//        g.drawImage(image,10,10,924,1227,this);
          g.setColor(Color.red);
          g.setFont(new Font("隶书",Font.BOLD,20));
          g.drawString("Welcome to Tokyo",100,100);
    }
}

