package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {

//        Set<String> hashSet =new HashSet<>();
//        Set<String> hashSet=new LinkedHashSet<>();
        Set<String> hashSet=new TreeSet<>();
      hashSet.add("apple");
        hashSet.add("Pineapple");
        hashSet.add("orange");
        hashSet.add("banana");
        hashSet.add("kiwi");
        hashSet.add("100");
//        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println(hashSet);
        for (String element :hashSet){
            System.out.println(element);
        }
        List<String> fruits=Arrays.asList("apple", "orange");
        Set<String> newfruits=new HashSet<>(fruits);
        System.out.println(newfruits);


    }
}
