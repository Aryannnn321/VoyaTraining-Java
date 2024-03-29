package com.objects.basics;
import java.util.Scanner;

public class StudentMain {
    public static void  main(String[] args){
      Scanner s = new Scanner(System.in);
        System.out.println("Name:");
        String name1 =s.nextLine();
        System.out.println("Department:");
        String dept =s.nextLine();
        System.out.println("Enter subjects:");
        int subject = s.nextInt();
        int[] marks = new int[subject];
        System.out.println("Marks for each subject:");
        for(int i=0; i<subject;i++){
            System.out.println((i+1));
            marks[i] = s.nextInt();
        }
        Student std1 = new Student(name1, dept);
        std1.printDetails();
        System.out.println(std1.getGrades(marks));
    }
}
