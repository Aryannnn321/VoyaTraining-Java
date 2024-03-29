package com.opps.inheritance.bean;

public class BeanDemo {
    public static  void  main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        vehicle.setModel("2009");

        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());
    }
}
