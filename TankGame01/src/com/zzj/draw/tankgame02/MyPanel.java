package com.zzj.draw.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author zzj
 * @version 1.0
 * 坦克大战绘图区
 */

//
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {//初始化坦克
        hero = new Hero(100,100);
        hero.setSpeed(5);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出坦克，封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }
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
        switch (direction) {
            case 0://表示向上
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x + 30, y,10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://表示向右
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y + 30,60,10,false);
                g.fill3DRect(x + 10, y + 10,40,20,false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://表示向下
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x + 30, y,10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://表示向右
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y + 30,60,10,false);
                g.fill3DRect(x + 10, y + 10,40,20,false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂无处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirection(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
