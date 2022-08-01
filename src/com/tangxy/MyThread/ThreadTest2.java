package com.tangxy.MyThread;


//实现Runnable接口；重写run方法，实例化实现接口的类，将实例作为Thread的构造器，最后调start（）；

public class ThreadTest2 implements Runnable{
    public String name;

    @Override
    public void run() {
        System.out.println("ThreadName:"+Thread.currentThread().getName());
    }

    public ThreadTest2(String name) {
        this.name=name;
    }
}

class RunMain {
    public static void main(String[] args) {
        ThreadTest2 r1 = new ThreadTest2("线程txy");
        ThreadTest2 r2 = new ThreadTest2("线程cxh");
        Thread t1 = new Thread(r1,r1.name);
        Thread t2 = new Thread(r2,r2.name);
        t1.start();
        t2.start();

    }
}

