package com.objects.basics;

public class Current   extends Account{
    Current(Double balance){
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
