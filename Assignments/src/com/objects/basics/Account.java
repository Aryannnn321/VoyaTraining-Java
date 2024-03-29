package com.objects.basics;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
        void withdraw(double amount){
            if(amount<=balance){
              balance-=amount;
                System.out.println("withdraw:" +amount);
            }
            else {
                System.out.println("Insufficient funds");
            }
        }
        void deposit(double amount){
        balance+=amount;
            System.out.println("Deposited:" +amount);
        }
        double getBalance(){
        return balance;
        }
    }

