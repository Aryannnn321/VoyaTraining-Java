package com.exception.custom;

import javax.naming.LimitExceededException;

public class VoyaBank {
    double  balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws LimitExceededException, NegativeBalanceException {
        System.out.println("in withdraw method");
        try {
            if (balance-amount<=0){
                 throw   new NegativeBalanceException("balance is negative");}
            if (amount>1000){
               throw  new LimitExceededException("limit exceeded");
            }
        }catch(NegativeBalanceException e){
            System.out.println("exception"+e.getMessage());
            throw e;
        }catch (LimitExceededException e){
            System.out.println("exception"+e.getMessage());
            throw  e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("work done");
    }



}
