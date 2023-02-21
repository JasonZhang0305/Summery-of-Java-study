package com.zzj.draw.tankgame04;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    //
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isSurviving = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }
    //将MyPanel的成员设置到enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }
    public boolean isTouchEnemyTank() {
        switch (this.getDirection()) {
            case 0:
                //让当前敌人坦克和其他所有的敌人坦克比较
                for(int i = 0; i < enemyTanks.size(); i++) {
                    //从vector中取一个坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if(enemyTank != this) {
                      if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                          if (this.getX() >= enemyTank.getX()
                                  && this.getX() <= enemyTank.getX() + 40
                                  && this.getY() >= enemyTank.getY()
                                  && this.getY() <= enemyTank.getY() + 60) {
                              return true;
                          }
                          if (this.getX() + 40 >= enemyTank.getX()
                                  && this.getX() + 40 <= enemyTank.getX() + 40
                                  && this.getY() >= enemyTank.getY()
                                  && this.getY() <= enemyTank.getY() + 60) {
                              return true;
                          }
                      }
                      if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                          if (this.getX() >= enemyTank.getX()
                                  && this.getX() <= enemyTank.getX() + 60
                                  && this.getY() >= enemyTank.getY()
                                  && this.getY() <= enemyTank.getY() + 40) {
                              return true;
                          }
                          if (this.getX() + 40 >= enemyTank.getX()
                                  && this.getX() + 40 <= enemyTank.getX() + 60
                                  && this.getY() >= enemyTank.getY()
                                  && this.getY() <= enemyTank.getY() + 40) {
                              return true;
                          }
                      }
                    }
                }
                break;
            case 1:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    //从vector中取一个坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if(enemyTank != this) {
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY() + 60
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40>= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    //从vector中取一个坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if(enemyTank != this) {
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                //让当前敌人坦克和其它所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从vector 中取出一个敌人坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果敌人坦克是上/下
                        //老韩分析
                        //1. 如果敌人坦克是上/下 x的范围 [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是 右/左
                        //老韩分析
                        //1. 如果敌人坦克是右/左  x的范围 [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while(true) {
            //让敌人坦克可以一直发子弹
            if (isSurviving && shots.size() < 1) {
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
                        if(!isTouchEnemyTank()) {
                            moveUp();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 60; i++) {
//                        if (getX() + 60 < 1000) {
                        if(!isTouchEnemyTank()) {
                            moveRight();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 60; i++) {
//                        if (getY() + 60 < 750) {
                        if(!isTouchEnemyTank()) {
                            moveDown();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 60; i++) {
//                        if (getX() > 0) {
                        if(!isTouchEnemyTank()) {
                            moveLeft();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
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
