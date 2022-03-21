//Q2. Create a class BookCollection which contains:
    //1. the owner's name and an array of books that the owner has,
   // 2. toString( ) that outputs all the books in the BookCollection in a nice format.
    //3. a method hasBook(Book b) which checks if the book b is contained in the array (we consider two books the same if they have the same title and author).
   // 4. a method sort() that sorts the books in the array by the lexicographical order of the book title, and author.
//Create your own BookCollection and check if you own a particular book:"Java in depth". Sort the BookCollection
//and output the BookCollection.

package com.bookcollection;

public class Book {
	private int id;
	private String title;
	private String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
}
