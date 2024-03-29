package com.objects.basics;
import java.util.Scanner;

public class EmployeeOverload {
    public static void main (String[] args){

        Scanner s= new Scanner(System.in);

        Employee1 employee1 = new Employee1("raju", "hr");
        employee1.calcBonus(2200);
        Employee1 employee2= new Employee1("raju", "admin");
        employee1.calcBonus(2200, 200, "Car");
        Employee1 employee3 = new Employee1("raju", "manager");
        employee1.calcBonus(2200, 220, "laptop");
        for( int i=0; i<=3; i++ ){
            String name = s.next();
            String designation =s.next();
            Employee1 employee = new Employee1(name, designation );
            if(designation.equals("hr")){
                employee1.calcBonus(2200);
            } else if (designation.equals("admin")) {
                employee1.calcBonus(2200, 200, "car");
            }
            else {
                employee1.calcBonus(2200, 200, "laptop");
            }
        }

        }

    }

