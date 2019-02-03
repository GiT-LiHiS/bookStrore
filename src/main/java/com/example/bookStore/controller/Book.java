package com.example.bookStore.controller;

public class Book {
	
	private String tittle;
	private String author;
	private String year;
	private String isbn;
	private double price;
	
	public Book() {
		
		tittle = "";
		author = "";
		year = "";
		isbn = "";
		price = 0;
	}
	
public Book(String tittle, String author, String year, String isbn, double price) {
		
	this.tittle = tittle;	
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
	

	}

public String getTittle() {
	return tittle;
}

public void setTittle(String tittle) {
	this.tittle = tittle;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
	


}
