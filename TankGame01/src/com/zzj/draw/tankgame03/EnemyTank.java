package com.zzj.draw.tankgame03;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    boolean isSurviving = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while(true) {
            //让敌人坦克可以一直发子弹
            if (isSurviving && shots.size() <= 3) {
                //如果敌人还活着并且没子弹了，就给它加一颗
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirection()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY(), 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            //根据坦克方向继续移动
            switch (getDirection()) {
                case 0:
                    //让坦克保持一个方向走30步移动一次
                    for (int i = 0; i < 60; i++) {
//                        if (getY() > 0) { //规定移动范围
                            moveUp();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                    }
                    break;
                case 1:
                    for (int i = 0; i < 60; i++) {
//                        if (getX() + 60 < 1000) {
                            moveRight();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                    }
                    break;
                case 2:
                    for (int i = 0; i < 60; i++) {
//                        if (getY() + 60 < 750) {
                            moveDown();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                    }
                    break;
                case 3:
                    for (int i = 0; i < 60; i++) {
//                        if (getX() > 0) {
                            moveLeft();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                    }
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //然后随机移动 0-3
            setDirection((int)(Math.random() * 4));
            //写并发程序一定要考虑清楚，该线程什么时候结束
            if (!isSurviving) {
                break;
            }
        }
    }
}
