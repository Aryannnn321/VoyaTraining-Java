package com.util.list;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("java", "Kathy", 900),
                new Book("spring", "murthy", 9780),
                new Book("python", "raju", 800),
                new Book("html", "suhas", 1090),
                new Book("css", "sreni", 760),
                new Book("node", "robin", 400)
        );
        System.out.println("List Book");
        for (Book book :books){
            System.out.println(book);
        }
        Set<String> newbook=new HashSet<>();
        System.out.println();
        System.out.println("Set Books");
        Set<Book> bookSet =new LinkedHashSet<>(books);
        for (Book book: bookSet){
            System.out.println(book);
        }
    }
}
