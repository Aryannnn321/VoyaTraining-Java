package com.inter.lam;

import java.util.Objects;

public class CalcLamda {
    public static void main(String[] args) {
     IMyCalculator calculator=(x,y)->x+y;{
            System.out.println("addition");

     };
        calculator=(x,y)->x-y;
            System.out.println("subtraction");

        calculator=(x,y)->x*y;
            System.out.println("multiplication");

        calculator=(x, y) -> x/y;
        System.out.println("division");
    }
}
