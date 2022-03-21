package com.bookcollection;
import java.util.*;
public class BookCollection {
	private String ownerName;
	private List<Book> books;
	
	public BookCollection(String ownerName) {
		this.ownerName = ownerName;
		this.books=new ArrayList<Book>();
		init();
	}
	private void init() {
		books.add(new Book(1, "java in action", "foo"));
		books.add(new Book(109, "power of mind", "bar"));
		books.add(new Book(19, "Java in depth", "jar"));
	}
	
	public boolean hasBook(Book b) {
		//search opeation  
System.out.println("Which book are you searching for today?");
    booksearch = input.nextLine();
    for (Book book : booklist)
    {
        if (book.getTitle().contains(booksearch) || book.getAuthor().contains(booksearch)
        {
             return book; 
        }
    }
    return null; //no book was found
	}
	
}
