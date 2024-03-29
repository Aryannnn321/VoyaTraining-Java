package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompartorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(
                new Vehicle("Nivea", "honda",34434535),
                new Vehicle("hexa", "honda",848990),
                new Vehicle("Santro", "bmw",67934535),
                new Vehicle("ALOO", "Maruthi",56434535),
                new Vehicle("X10", "HYNDAI",214899)
        );
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("sort by brand");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by price");
        Collections.sort(vehicles, new PriceSort());
        for (Vehicle vehicle :vehicles){
            System.out.println(vehicle);
        }
    }
}
