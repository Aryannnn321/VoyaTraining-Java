package com.objects.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("balance is:" +balance);
    }
    void deposit(double amount){
       balance+=amount;
        System.out.println("balance is:" +balance);
    }
    double getBalance(){
        return balance;
    }
}
