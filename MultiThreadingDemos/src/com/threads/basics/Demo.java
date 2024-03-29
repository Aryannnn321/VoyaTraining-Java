package com.threads.basics;
class A implements Runnable{

    @Override
    public void run() {
        System.out.println("Great Day");
    }
}


public class Demo {
    public static void main(String[] args) {
        Thread thread=new Thread();
        Runnable  task1=()->{
            System.out.println("Task1");
        };
        Thread thread1=new Thread(task1,"pop");
        Thread thread2=new Thread(()->{
            System.out.println("task2");
        },"top");
        thread1.start();
        thread2.start();

    }
}
