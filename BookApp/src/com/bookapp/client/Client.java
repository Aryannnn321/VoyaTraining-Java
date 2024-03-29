package com.bookapp.client;

import com.bookapp.exceotion.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name =s.next();
        IBookService bookService=new BookServiceImpl();
        List<Book> booksBycategory;
        try {
            booksBycategory=bookService.getByCategory(name);
            for (Book book:booksBycategory){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            e.printStackTrace();
        }
    }
}
