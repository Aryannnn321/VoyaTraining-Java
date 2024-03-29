package com.book.repository;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.module.Book;

import java.util.List;

public interface IBookRepository {
    void  addBook(Book book);
   void updateBook(int bookId, double price);
   void deleteBook(int bookId);
   Book getById(int bookId) throws IdNotFoundException;
   List<Book> findAll();
   List<Book> findByAuthor(String author ) throws BookNotFoundException;
   List<Book> findByLesserPrice(double price) throws  BookNotFoundException;

}
