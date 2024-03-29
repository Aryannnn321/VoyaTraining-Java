package com.util.maps;

import java.security.KeyStore;
import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap=new HashMap<>();
        stateMap.put("karnataka", Arrays.asList("Mudigere","shivamoga","chickamagaluru"));
        stateMap.put("Tamilnadu", Arrays.asList("Chennai", "coimbotatru","veelloru"));
        stateMap.put("andraparadesh", Arrays.asList("gunturu", "kadapa", "udupi"));
        stateMap.put("Maharastra",Arrays.asList("vidrabha", "mumbai","pune"));
        System.out.println(stateMap);
        System.out.println();
        System.out.println("list of state");
        Set<Map.Entry<Integer, String>> entries=new HashSet<>();
        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+"\t" +entry.getValue());
        }
    }
}
