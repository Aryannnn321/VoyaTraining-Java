package com.book.repository;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.module.Book;

import java.util.List;

public class BookRepositoryImpl implements  IBookRepository{
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        return null;
    }
}
