package com.opps.overloading;

public class VehicleName {
    public static void main(String[] args){
        Vehicle vehicle= new Vehicle();
        Vehicle vehicle1= new Vehicle("honda");
        Vehicle vehicle2= new Vehicle("hero");
        Vehicle vehicle3= new Vehicle("audi");

        vehicle.getDetails();
       vehicle2.getDetails();
       vehicle1.getDetails();
       vehicle3.getDetails();




    }
}
