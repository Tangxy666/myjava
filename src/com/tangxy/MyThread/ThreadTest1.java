package com.tangxy.MyThread;


//继承Thread类，重写run方法，定义构造器，实例化每一个线程。
public class ThreadTest1 extends Thread{

    @Override
    public void run() {
        System.out.println("ThreadName:"+Thread.currentThread().getName()+"-");
    }

    public static void main(String[] args) {

//        method1
        Thread t1=new ThreadTest1("txy");
        ThreadTest1 t2 = new ThreadTest1("cxh");
        t1.start();
        t2.start();

        System.out.println("ThreadName:"+Thread.currentThread().getName());
    }

    public ThreadTest1(String name){
        super(name);
    }
}
