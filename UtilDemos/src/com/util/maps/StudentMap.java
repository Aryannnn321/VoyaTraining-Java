package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        Map<Department, List<Student>> map=new HashMap<>();
        Department department1 = new Department("shivu", 11, "cse");
        map.put(department1 , Arrays.asList(new Student("soma", "banglore"),
                new Student("raju", "mysore"),
                new  Student("JO","CKM")));
        Department department2 = new Department("nithin", 171, "ece");
        map.put(department2 , Arrays.asList(new Student("rohitj", "raichur"),
                new Student("smith", "mdg"),
                new  Student("kane","hsk")));

        Set<Department> departments = map.keySet();
        for (Department department:departments){
            System.out.println(department.getDeptHead()+""+department.getDeptName());
            List<Student> students =map.get(department);
            for (Student student: students){
                System.out.println(student.getStudNmae());
            }
        }
    }
}
