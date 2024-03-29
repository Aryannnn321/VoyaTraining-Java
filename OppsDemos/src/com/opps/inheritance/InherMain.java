package com.opps.inheritance;

public class InherMain {
    public static void main(String[] args){
        InEmployee inEmployee= new InEmployee();
        inEmployee.getDetails();
        InManager inManager=new InManager();
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
