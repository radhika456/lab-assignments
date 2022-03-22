package com.owner.web.controller;
import java.util.*;
import com.owner.model.dao.Book;
import com.owner.model.service.BookService;
import com.owner.model.service.BoookServiceImpl;

public class DemoBook {

	public static void main(String[] args) {
		BookService bookService=new BoookServiceImpl();
		List<Book>books=bookService.getAll();
		System.out.println("All Books---------");
		for(Book book : books)
		{
			System.out.println(book);
		}
		Book book=new Book("java basics","ABC", 1500);		
		//bookService.updateBook(10003, book);
	}
}
