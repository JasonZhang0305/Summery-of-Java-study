package com.zzj;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        TT t = new TT();
        t.setName("zzj");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println("t的优先级为" + t.getPriority());
        t.interrupt();
    }
}
class AA {}
class TT extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 吃包子～～～～" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + " is resting~~~~");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }
    }
}

