package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> fruits1 = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("orange");
        fruits.add("blueberry");
        fruits.add("apple");
        fruits.add("grapes");
        System.out.println(fruits);
        for (String fruit : fruits) {
            if (fruit.startsWith("b")) {
                fruits1.add(fruit);
            }
        }

        for (String fruit : fruits1) {
            System.out.println(fruit);
        }
    }
}
