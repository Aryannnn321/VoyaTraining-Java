package com.opps.overloading;

public class VarargsDemo {
    void calcSum(String name, int... marks){
        System.out.println("welcome" + name);
        int sum=0;
        for (int mark :marks){
            sum +=mark;
            System.out.println("sum" +sum);
        }

    }
    void calcSum(String name){
        System.out.println("hello" + name);
    }
    public static void main(String[] args){
        VarargsDemo demo = new VarargsDemo();
        demo.calcSum("Sri",90,80,90);
        demo.calcSum("priya");
        demo.calcSum("roni", 90, 80);
    }
}
