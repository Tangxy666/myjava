package com.tangxy.MyThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadMethdTest {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 5; i++) {
            Task1 t = new Task1(i);
            executor.execute(t);
        }
        executor.shutdown();
    }
}

class Task1 implements Runnable{

    private int i;

    @Override
    public void run() {
        int k=0;
        System.out.println();
        for (int j = 0; j <= i; j++) {
            k+=j;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"加完数为:"+k);
    }

    public Task1(int i) {
        this.i = i;
    }
}
