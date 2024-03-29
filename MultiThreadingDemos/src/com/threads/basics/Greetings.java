package com.threads.basics;

public class Greetings {
   public String sayHello(String name) throws InterruptedException {
        String result = "Welcome"+ name;

        try{
            System.out.println("hi"+name);
            Thread.sleep(1000);
            result ="Great day";
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return  result;
    }
}
