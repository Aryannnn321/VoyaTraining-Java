package com.list.custom;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("java");
        list.add("spring");
        list.add("angular");
        list.add("maven");
        list.add("node");
        System.out.println(list);
        list.addFirst("html");
        list.addFirst("css");
        list.addFirst("react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String val=iterator.next();
            System.out.println(val);
        }

    }
}
