package com.tangxy.MyThread;



public class ThreadSellingTickets implements Runnable {
    private static int num = 5;

    public void sell() {
        synchronized (this) {
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
        }
    }
    @Override
    public void run() {
        sell();
    }
}

class MyMain1{
    public static void main(String[] args) {
        ThreadSellingTickets t = new ThreadSellingTickets();
        for (int i = 0; i < 11; i++) {

            Thread thread = new Thread(t, "消费者" + i);
            thread.start();
        }


    }
}


