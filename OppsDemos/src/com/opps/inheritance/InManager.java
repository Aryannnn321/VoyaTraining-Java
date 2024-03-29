package com.opps.inheritance;

public class InManager extends InEmployee {
    double salary;

    public InManager(double salary) {
        this.salary = salary;
    }

    InManager(){
        employeeName="Priya";
        employeeId=101;
        salary=1000;
    }
    void printBonus(double amount){
        System.out.println("Bonus"+ (amount+salary));
    }
}
