package com.inter.lam;

public class LambdaDemo {
    public static void main(String[] args) {
        IGreater greet= (String message)->{
            System.out.println(message);
        };
        greet.greetMessage("Great day");
        greet= message -> System.out.println((message="!!!!"));
        greet.greetMessage("wow");
    }
}
