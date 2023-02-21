package com.zzj.Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB(a);
        a.start();
        b.start();

    }
}

class ThreadA extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() { //a线程在不断输出1-100的数字
        while (loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadB extends Thread {
    private ThreadA a;
    private Scanner scanner = new Scanner(System.in);
    public ThreadB(ThreadA a) {
        this.a = a;
    }

    @Override
    public void run() {//b线程进去之后一直卡在输入指令
        while (true) {
            System.out.println("please enter your command(Q represents exit). ");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("ThreadB exits. ");
            }
        }
    }
}
