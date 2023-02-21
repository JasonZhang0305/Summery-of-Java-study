package com.zzj.draw.tankgame03;

public class Bomb {
    int x, y;//炸弹的横纵坐标
    int life = 6;//炸弹的生命周期
    boolean isExisting = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isExisting = false;
        }
    }
}
