package com.exception.basic;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("welcome");
            String value ="gani";

            System.out.println("value"+value);
            int num = Integer.parseInt(value);
            System.out.println("number" +num);
            int result =100/num;
            System.out.println(result);

        }catch (Exception e) {
            System.out.println(e.getMessage());

        }finally {
            System.out.println("close the connection");
        }
        System.out.println("continue..");
    }
}
