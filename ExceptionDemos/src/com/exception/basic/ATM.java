package com.exception.basic;

import javax.management.MBeanAttributeInfo;

public class ATM {
    public static void main(String[] args) {
        System.out.println("welcome");
        Bank bank=new Bank();
        try {
            bank.withdraw(220);
            System.out.println("AMOUNT WITHDRAW");
        }catch(Exception e){
            System.out.println("exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("good bye");

    }
}
