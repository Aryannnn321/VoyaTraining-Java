package com.objects.basics;


import java.util.Scanner;

public class BankMain {

        public static void main (String[]args) {
            Bank bank=new Bank(3000);
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter either you want to withdraw or deposit :");
            String input = s.next();
            System.out.println("enter amount to "+input);

            switch (input) {
                case "withdraw":
                    int withdrawamount =s.nextInt();
                    bank.withdraw(withdrawamount);
                    break;
                case "deposit":
                    int depositawamount =s.nextInt();
                    bank.deposit(depositawamount);
                    break;
                case "balance" :
                    System.out.println("balance is :" +bank.getBalance());
                    break;
                default :
                    System.out.println("Please enter correct input");

            }

        }

}
