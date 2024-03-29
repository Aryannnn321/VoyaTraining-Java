package com.inter.lam;

public class ShapeLamda {
    public static void main(String[] args) {
        IShape shape=(x, y)->{
            System.out.println("React"+x+y);
        };
        shape.area(10,20);
        shape=(x,y)-> System.out.println("tri"+(0.5*x+y));
        shape.area(23,56);


    }
}
