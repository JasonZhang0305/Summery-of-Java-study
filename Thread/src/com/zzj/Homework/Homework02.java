package com.zzj.Homework;

/*题目要求；
 * 有两个用户分别从同一张卡上取钱，总额10000
 * 每次都去1000，当余额不足时，就不能取款了
 * 不能出现超取现象，线程同步问题
 */
public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2  = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}

//编写取款线程
//1 因为这里涉及到多个线程共享资源，所以这里使用Runnable
class T implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            //哪个线程先争夺到this锁，就会先执行
            //争夺不到就不爱被blocked，准备继续争夺
            //前面的线程结束了之后，继续争夺
            //非公平锁不确定下次谁能争取到
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() +
                        "取出了1000， 当前余额为" + money);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
