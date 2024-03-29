package com.objects.basics;

public class Book {
    String  title;
    String author;
    double price;
    String category;

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

        void getDetails(){
            System.out.println("titlename" +title);
            System.out.println("authorname"+ author);
            System.out.println("pricedetails"+price);
            System.out.println("categorydetails"+category);
        }
        void checkbookType(){
        if(price>500){
            System.out.println("premium books");
        }
        else{
            System.out.println("standard books");
        }
        }
    }

