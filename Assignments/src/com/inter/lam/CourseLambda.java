package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {

        ICourse webCourse=()->{
            String[] web ={"html" , "css", "bootscrap"};
            return web;
        };
        String[] web = webCourse.showCourses();
        for (String webc:web){
            System.out.println(webc);
        }
        ICourse javaCourse=()->{
            String[] java ={"spring" , "java", "junit"};
            return java;
        };
        String[] java = webCourse.showCourses();
        for (String javac:java){
            System.out.println(javac);
        }

    }
}
