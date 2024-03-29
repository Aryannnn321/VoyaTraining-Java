package com.objects.basics;

public class Student {
   String name;
   String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }
    void printDetails(){
        System.out.println("Name:" +name);
        System.out.println("Department: +department");
    }
    public String getGrades(int... marks){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        double average =sum/ (double) marks.length;
        if (average>=90){
            return "A";
        } else if (average>=80) {
            return "B";
        } else if (average>=70) {
            return "C";
        } else if (average>=60) {
            return "D";
        } else if (average>=50) {
            return "E";
        }
        else {
            return "fail";

        }
    }
}

