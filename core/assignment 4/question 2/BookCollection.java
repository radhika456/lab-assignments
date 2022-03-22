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
		books.add(new Book(1, "java basics", "abc"));
		books.add(new Book(109, "advance c++", "efg"));
		books.add(new Book(19, "Java in depth", "hij"));
	}
	
	public boolean hasBook(Book b) {
		//search opeation  
System.out.println("Which book are you searching for today?");
    booksearch = input.nextLine();
    for (Book book : booklist)
    {
        if (book.getTitle().contains(booksearch) || book.getAuthor().contains(booksearch)
        {
                System.out.println("Owner of Book is "+ownerName+" having book with Id no. - "+b.getId()+",Title : "+b.getTitle()+" and Book Author : "+b.getAuthor());
		return true; 
        }
    }
    return false; //no book was found
	}
	
}
