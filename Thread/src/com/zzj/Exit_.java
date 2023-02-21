package com.zzj;

public class Exit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();
        //如果希望主线程去控制T1线程的进程，使其终止，可以修改loop变量
        //让t1退出run方法，从而终止t1线程 -> 通知方式
        System.out.println("====主线程开始休息===");
        Thread.sleep(10*1000);
        t1.setLoop(false);
    }
}
class T extends Thread {
    int count;
    private boolean loop = true;

    public void setLoop(boolean loop) {

        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("T运行中..." + count);
        }
    }
}
