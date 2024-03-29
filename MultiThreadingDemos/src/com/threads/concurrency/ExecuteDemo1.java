package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(23);
        executorService.execute(()->{
            System.out.println("doing polling");
            Greetings greet=new Greetings();
            try {
                greet.sayHello("kashi");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.execute(()->{
            System.out.println("extracting from url");
            Booking booking =new Booking();
            System.out.println(booking.boolTickets("smrithi",18));
        });
        executorService.execute(()->{
            System.out.println("Reading from db");
        });
    }
}
