package com.tangxy.MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSellingTicketsLock implements Runnable{
    private static int num = 5;
    private final Lock selllock=new ReentrantLock();

    public void sell() {
            selllock.lock();
            if (num > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                num -= 1;
                System.out.println(Thread.currentThread().getName() + "买票成功，" + "当前剩余票数为" + num);
            } else
                System.out.println(Thread.currentThread().getName() + "买票失败，" + "当前剩余票数为" + num);
            selllock.unlock();
    }
    @Override
    public void run() {
        sell();
    }

}

class MyMain3{
    public static void main(String[] args) {
        ThreadSellingTicketsLock t = new ThreadSellingTicketsLock();
        for (int i = 0; i < 11; i++) {

            Thread thread = new Thread(t, "消费者" + i);
            thread.start();
        }


    }
}
