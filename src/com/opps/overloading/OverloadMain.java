package com.opps.overloading;

public class OverloadMain {
    public static void main(String[] args){
        Shape shape = new Shape();
        shape.calArea(10);
        shape.calcArea(2.0);
      int rect = shape.calcArea(10, 20);
        System.out.println("React"+rect);
        double tri = shape.calcArea(2.0f, 10);
        System.out.println("tri"+tri);

    }
}
