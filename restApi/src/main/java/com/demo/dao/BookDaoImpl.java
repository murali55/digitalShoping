package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.models.Book;
@Repository
@Transactional
public class BookDaoImpl implements BookDao{
	public BookDaoImpl() {
		System.out.println("bookimpl been is created");
	}
	@Autowired
	private SessionFactory sessionFactory;
	public List<Book> getAllBooks() {
		
		Session session=sessionFactory.getCurrentSession();
		//HQL - from Book
		//SQL -  select * from book
		Query query=session.createQuery("from Book");
		return query.list();
	}
	
	public Book getBook(int isbn) {
        Session session = sessionFactory.getCurrentSession();
        Book book= (Book)session.get(Book.class, isbn);
		return book;
	
	}

	public Book addBok(Book book) {
		
	    Session session = sessionFactory.getCurrentSession();
		session.save(book);
		return book;
		
	}

	
	public void deleteBook(int isbn) {
		Session session= sessionFactory.getCurrentSession();
		Book book= (Book)session.get(Book.class, isbn);
	}

	public void updateBook(Book book) {
	    Session session =sessionFactory.getCurrentSession();
	    session.update(book);
	}

}
