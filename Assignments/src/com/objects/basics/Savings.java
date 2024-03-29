package com.objects.basics;

public class Savings  extends Account{
    Savings(double balance){
        super (balance);
    }

    @Override
    void withdraw(double amount) {

        super.withdraw(amount);
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
    }
}
