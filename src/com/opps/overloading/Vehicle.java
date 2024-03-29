package com.opps.overloading;

import java.sql.SQLOutput;

public class Vehicle {
    String brand;
    double price;
    String module;

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle() {
        System.out.println("default");

    }

    public Vehicle(String brand, double price) {
        this(brand);
        System.out.println("two");
        this.brand = brand;

    }

    public Vehicle(String brand, double price, String module) {
        this(module,price);
        System.out.println("three");
        this.brand = brand;

    }
    void getDetails(){
        if (brand!=null)
        System.out.println("brand" + brand);
        if (price>0)
        System.out.println("price"+price);
        if (module!=null)
        System.out.println("module" +module);
    }
}
