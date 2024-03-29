package com.threads.basics;

public class Dashboard {
    public static void main(String[] args) {
        Booking booking= new Booking();
        Counter counter= new Counter("tom",10,booking);
        Counter counter1=new Counter("sam", 20, booking);
        Counter counter2=new Counter("jo",12,booking);

    }
}
