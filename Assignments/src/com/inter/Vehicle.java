package com.inter;

abstract public class Vehicle implements IExternal,IInterior {
    String brand;
    String model;

    @Override
    public void insuranceDetails() {
        System.out.println("insurance");
    }

    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
   void getDetails(){
       System.out.println(brand);
       System.out.println(model);
       System.out.println(price);

    }
    abstract void  getMilage();

}
