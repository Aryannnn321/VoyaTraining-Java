package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape shape = new Rectangle();
        factory.printArea(shape, 23,67);
        System.out.println("area");
        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri" +(x*y*0.5));
            }
        }, 10, 40);

    }
}
