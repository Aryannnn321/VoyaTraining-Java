package com.opps.stat;

public class Demo {
    public static void main(String[] args) {
        System.out.println("main demo");
        try {
            Class.forName("com.opps.stat.Trial");
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
        Trial.getMessage();
        System.out.println(Trial.x+Trial.y);
    }
}
