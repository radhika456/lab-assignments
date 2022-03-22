package com.bookapp.model.service;

import java.util.List;
import com.bookapp.model.dao.Book;

public interface BookService {
	public List<Book> getAll();
	public void addBook(Book book);
	public void deleteBook(int bookId);
	public void updateBook(int bookId, Book book);
	public Book findById(int id);
}
