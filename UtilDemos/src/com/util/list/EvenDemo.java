package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12,34,45,56,78);
        List<Integer> even=new ArrayList<>();

        for (Integer number :numbers){
            if (number%2==0){
               even.add(number);

            }

        }
        for (Integer number :even){
            System.out.println("number");
        }
    }
}
