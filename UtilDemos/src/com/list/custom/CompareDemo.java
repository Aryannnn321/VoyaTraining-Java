package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<Book> books= Arrays.asList(
                new Book("java", "kathy",100 ),
        new Book("html", "jo",500 ),
        new Book("css", "suni",200 ) ,
        new Book("spring", "kathy",300)) ;

           for (Book book:books){
               System.out.println(book);
           }
        System.out.println("before sorting");
           for (Book nbook:books){
               System.out.println(nbook);
           }
        System.out.println("after sorting");
        Collections.sort(books);
        for (Book book:books){
            System.out.println(book);
        }

    }
}
