package com.zzj;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        // run方法就是一个普通的方法，会阻塞在这里，start才能真正启动线程
        //当main线程启动一个自线程Thread-0，祝线程不会阻塞，会继续执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i=" + i);
            Thread.sleep(1000);
        }

    }
}
//当一个类继承了Thread时，该类就可以当作线程使用
//我们会重写run方法，写上自己的逻辑
//Thread继承Runnable
class Cat extends Thread {
   int times = 0;
    @Override
    public void run() {
        //每隔一秒输出一次maio～
        while(true) {
            System.out.println("miao～" + (++times) + "多线程名=" + threadId());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
    //            throw new RuntimeException(e);
                e.printStackTrace();
            }
            if (times == 100) {
                break;
            }
        }
    }
}
