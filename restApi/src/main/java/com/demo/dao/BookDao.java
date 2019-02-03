package com.demo.dao;

import java.util.List;

import com.demo.models.Book;

public interface BookDao {
 List<Book> getAllBooks();//select * from book
 Book getBook(int isbn);
 Book addBok(Book book);
 void deleteBook(int isbn);
 void updateBook(Book book);
}
