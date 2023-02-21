package com.zzj.draw.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出坦克，封装方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }

    //编写方法-画出坦克
    /**
     *
     * @param x 坦克的左上角x坐标
     * @param y 坦克右上角y坐标
     * @param g 画笔
     * @param direction 坦克方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        //根据类型判断坦克，并设置不同颜色
        switch(type) {
            case 0://我们的坦克
                g.setColor(Color.red);
                break;
            case 1://敌人的坦克
                g.setColor(Color.lightGray);
                break;
        }
        //根据坦克方向绘制坦克
        switch(direction) {
            case 0://表示向上
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x + 30, y,10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂无处理");
        }
    }
}
