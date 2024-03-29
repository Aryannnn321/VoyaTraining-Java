package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLamda {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("Nivea", "honda", 34434535),
                new Vehicle("hexa", "honda", 848990),
                new Vehicle("Santro", "bmw", 67934535),
                new Vehicle("ALOO", "Maruthi", 56434535),
                new Vehicle("X10", "HYNDAI", 214899)
        );
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
                Collections.sort(vehicles, ((o1, o2) ->o1.getBrand().compareTo(o2.getBrand())));

                for (Vehicle vehicle :vehicles){
                    System.out.println(vehicle);
                }
        Collections.sort(vehicles, ((o1, o2) ->o1.getModel().compareTo(o2.getModel())));
        System.out.println("model");
        for (Vehicle vehicle :vehicles){
            System.out.println(vehicle);
        }


    }
}
