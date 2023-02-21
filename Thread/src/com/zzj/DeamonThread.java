package com.zzj;

public class DeamonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDeamonThread myDeamonThread = new MyDeamonThread();

        //如果我们希望当main线程结束后，子线程自动结束
        //只需要将子线程设为守护线程即可
        myDeamonThread.setDaemon(true);//设置为守护线程
        myDeamonThread.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("宝强在辛苦工作...");
            Thread.sleep(1000);
        }
    }
}
class MyDeamonThread extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("马荣和宋杰在激情聊天");
        }
    }
}

