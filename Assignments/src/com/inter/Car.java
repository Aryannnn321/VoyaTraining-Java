package com.inter;

public class Car  extends  Vehicle implements  IAccessories{
    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;

    }

    @Override
    public void showAccessories() {
        System.out.println("sa");
    }

    @Override
    public void exterior() {
        System.out.println("ext");
    }

    @Override
    public void interior() {
        System.out.println("int");
    }

    @Override
    void getMilage() {
        System.out.println("mil");
    }
}
