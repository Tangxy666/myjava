package com.tangxy.MyThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest4 {
    public static void main(String[] args) {

        /**
         * int corePoolSize,   要保留在池中的线程数，即使它们是空闲的，除非设置了 allowcorethreadtimeout
         * int maximumPoolSize, 池中允许的最大线程数
         * long keepAliveTime,  当线程数量大于核心时，这是多余的空闲线程在终止前等待新任务的最长时间。
         * TimeUnit unit,       保存时间参数的时间单位
         * BlockingQueue<Runnable> workQueue 在执行任务之前保存任务的队列。此队列将仅保存由 execute 方法提交的可运行任务。
         *
         */
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 5; i++) {
            MyTask t1 = new MyTask(i+"");
            executor.execute(t1);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }

        executor.shutdown();
        System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());

    }
}

class MyTask implements Runnable {

    private String name;
    @Override
    public void run() {
        System.out.println("name:"+this.name);
    }

    public MyTask(String name) {
        this.name=name;
    }
}
