package com.opps.overloading;

public class Shape {
    void calArea(int length){
        System.out.println("Sq" +(length*length));
    }
    int calcArea(int length, int breadth){
        return length*breadth;
    }
    void calcArea(double radius){
        System.out.println("circle" +Math.PI*Math.pow(radius,2));
    }
    double calcArea(double base, int height){
        return (0.5*base*height);
    }
}
