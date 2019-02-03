package com.demo.controllers;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dao.BookDao;
import com.demo.models.Book;
@Controller
public class BookController {
	 public BookController()
	 {
		 System.out.println("BookController bean is created");
	 }
 @Autowired
 private BookDao bookDao; 
 

 //convert list of books into array of json obtects
 @RequestMapping(value="/getallbooks", method= RequestMethod.GET)
 public @ResponseBody List<Book> getAllBooks()
 {
	 List<Book> books= bookDao.getAllBooks();
	 return books;
 }
 @RequestMapping(value="/getbook", method=RequestMethod.GET)
 public @ResponseBody Book getBook(@RequestParam int isbn) {
	 Book book= bookDao.getBook(isbn);
	 return book;
	 
 }
 @RequestMapping(value="/addbook", method= RequestMethod.POST)
 public @ResponseBody Book addBook(@RequestBody Book book) {
	 bookDao.addBok(book);
	 return book;
 }
 @RequestMapping(value="/deletebook", method= RequestMethod.DELETE)
 public @ResponseBody void deleteBook(@RequestBody int isbn){
	 bookDao.deleteBook(isbn);
 }
@RequestMapping(value="/updatebook", method=RequestMethod.PUT)  
 public @ResponseBody Book updateBook(@RequestBody Book book){	 
	 bookDao.updateBook(book);
	 return book;
	 
 }
 
 
}
