package com.tangxy.MyThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable方法，重写call方法，该方法有返回值，实例化类，调new FutureTask<>(c1)；再调new Thread(f1)，通过f1.get
 * 能获得call方法的返回值
 */
public class ThreadTest3 implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTest3 c1 = new ThreadTest3();
        ThreadTest3 c2 = new ThreadTest3();
        FutureTask<String> f1 = new FutureTask<>(c1);
        FutureTask<String> f2 = new FutureTask<>(c2);

        new Thread(f1,"线程txy").start();
        new Thread(f2,"线程cxh").start();
        System.out.println("线程txy返回值为："+f1.get());
        System.out.println("线程cxh返回值为："+f2.get());

    }

    @Override
    public Object call() throws Exception {
        return "我是"+Thread.currentThread().getName();
    }
}
