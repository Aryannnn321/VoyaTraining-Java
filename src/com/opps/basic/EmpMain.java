package com.opps.basic;

public class EmpMain {
    public static void main(String[] args){
        System.out.println("welcome");
        Employee employee = new Employee("Raju", 12,5000);
        employee.employeeName ="Raju";
        employee.employeeId =12;
        employee.salary =2000;
        employee.getDetails();
        System.out.println(employee.greet(" hai "));
    }
}
