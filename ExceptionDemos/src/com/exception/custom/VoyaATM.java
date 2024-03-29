package com.exception.custom;

import com.exception.basic.Bank;

import javax.management.MBeanAttributeInfo;
import javax.naming.LimitExceededException;

public class VoyaATM {
    public static void main(String[] args) {
        System.out.println("Voya atm");
      VoyaBank voyaBank=new VoyaBank(4000);
      try {
          voyaBank.withdraw(2000);
          System.out.println("amount withdraw");
      }catch(NegativeBalanceException e){
          System.out.println(e.getMessage());
      }catch (LimitExceededException e){
          System.out.println(e.getMessage());
      }
        System.out.println("good bye");
    }
}
