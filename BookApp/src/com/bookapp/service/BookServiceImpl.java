package com.bookapp.service;

import com.bookapp.exceotion.BookNotFoundException;
import com.bookapp.exceotion.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements  IBookService{

    List<Book> books;
    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartswitch(String author) throws BookNotFoundException {

        List<Book> bookByAuthor=new ArrayList<>();
        for (Book book:bookByAuthor){
            if (book.getAuthor().startsWith(author)){
                bookByAuthor.add(book);
            }

        }
        if (bookByAuthor.isEmpty()){
                throw new BookNotFoundException("book by this author not available");
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> bookByCategory=new ArrayList<>();
        for (Book book:bookByCategory){
            if (book.getAuthor().equals(category)){
                bookByCategory.add(book);
            }

        }
        if (bookByCategory.isEmpty()){
            throw  new BookNotFoundException("no book");
        }

        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {

      List<Book> bookByPrice=new ArrayList<>();
      for (Book book:bookByPrice){
          if (book.getPrice()<price){
              bookByPrice.add(book);
          }
      }
        return bookByPrice;
    }

    @Override
    public List<Book> getByAuthorcontainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> newbook=new ArrayList<>();
        for (Book book:books){
            if (book.getCategory().equals(category)){
                newbook.add(book);
            }

        }
        return null;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {

       for (Book book:books){
           if (book.getBookId()==bookId){
               return  book;
           }
       }
       throw new IdNotFoundException("id is not found");

    }
}
