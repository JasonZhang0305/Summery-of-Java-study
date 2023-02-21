package com.zzj.sellticket;

import java.io.ObjectStreamException;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //出现超卖的情况
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}
class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
            break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数="
            + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private static int ticketNum = 100;
    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数="
                    + (--ticketNum));
        }
    }
}

class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;//控制run的变量
    Object obj = new Object();

    //同步方法（静态的）的锁为当前类本身
    public synchronized static void m1(){}
    //静态方法中实现一个同步代码块
    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }

    //synchronized void sell() 是个同步方法
    //这时锁在 this对象上
    //也可以加载代码块上写synchronize 同步代码块，互斥锁还是在this对象上
    public /*synchronized*/ void sell() { //同一时刻只能有一个线程执行sell方法
        synchronized (/*this*/ obj) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }

    @Override
    public /*synchronized*/ void run() { //同一时刻只能有一个线程执行run方法
        while (loop) {
            sell();
        }
    }
}
