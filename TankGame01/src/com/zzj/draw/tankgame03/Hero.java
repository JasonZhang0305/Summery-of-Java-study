package com.zzj.draw.tankgame03;

import java.util.Vector;

public class Hero extends Tank {
    //定义一个Shot对象，表示一个射击线程
    Shot shot = null;
    //定义一个shot集合，可以发多颗
    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    //shoot
    public void shotEnemyTank() {
        switch(getDirection()) {
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //把新建的shot放入shots中
        shots.add(shot);
        //启动shot线程
        new Thread(shot).start();
    }
}
