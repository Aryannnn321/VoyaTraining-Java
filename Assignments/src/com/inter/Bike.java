package com.inter;

public class Bike  extends  Vehicle implements  IExternal{
    String showCapacity;

    public Bike(String brand, String model, double price, String showCapacity) {
        super(brand, model, price);
        this.showCapacity = showCapacity;
    }

    @Override
    public void showAccessories() {

    }

    @Override
    public void exterior() {

    }

    @Override
    public void interior() {

    }

    @Override
    void getMilage() {

    }
}

