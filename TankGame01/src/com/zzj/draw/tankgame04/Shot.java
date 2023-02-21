package com.zzj.draw.tankgame04;

public class Shot implements Runnable {
    int x;
    int y;
    int direction = 0;
    int speed = 5;
    boolean isExisting = true;

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public void run() {
        while (true) {
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direction) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
            System.out.println("子弹 x=" + x + "y=" + y);
            //当子弹碰到敌人坦克或边界时，就应该终止子弹的线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isExisting)) {
                isExisting = false;
                break;
            }
        }
    }
}
