package com.objects.basics;
import java.util.Scanner;

public class ATMMain {
    public static  void main (String[] args){
        Scanner s= new Scanner(System.in);
        Account account=new Savings(1000);
        int choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter amount to withdraw");
                double withdrawAmount=s.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.println("Enter amount to deposit:");
                double depositAmount=s.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Current Balance:" + account.getBalance());
                break;
            case 4:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
