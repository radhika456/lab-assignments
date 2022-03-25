
package com.bookstoreapp.model.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//DTO
@Entity
@Table( name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
public class Book {
    protected int id;
    protected String title;
    protected String author;
    protected float price;
 
    public Book() {
    }
 
    public Book(int id) {
        this.id = id;
    }
 
    public Book(int id, String title, String author, float price) {
        this(title, author, price);
        this.id = id;
    }
     
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
	public String toString() {
		return "Book [Book Id=" + bookId + ", Book Name =" + bookName + ", Book Auhtor =" + bookAuthor + ", Book Price =" + bookPrice + "]";
	}
	
}
