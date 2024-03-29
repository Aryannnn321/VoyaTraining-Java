package com.threads.basics;
class Child extends  Thread{
    public  Child(String name, int priority){
       super(name);
        System.out.println(this);
//        this.start();
    }
    @Override
  public void  run(){

       for(int i=1; i<10;i++) {
           String name=Thread.currentThread().getName();
           System.out.println("3*"+i+"="+(3*i)+" "+name);
           try{
               Thread.sleep(2000);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}

public class ExThread {
    public static void main(String[] args) {
//      Child child1=new Child("child-one",10);
//      child1.setName("child-one");
//        System.out.println(child1);

        Child child2=new Child("child-two",5);
        child2.setName("child-two");
        child2.setDaemon(true);

        System.out.println(child2);

//        Child child3=new Child("child-three",7);
//        child3.setName("child-three");
//        System.out.println(child2);

        for(int i=1; i<10;i++) {
            String name=Thread.currentThread().getName();
            System.out.println("3*"+i+"="+(3*i));
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
//        try {
//            child1.join();
//            child2.join();
//            child3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("main completed");


    }
}
