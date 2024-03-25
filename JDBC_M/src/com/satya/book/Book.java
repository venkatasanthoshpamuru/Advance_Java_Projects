package com.satya.book;

public class Book {
 private String bookId;
 private String bookName;
 private double price;
public Book(String bookId, String bookName, double price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.price = price;
}
public Book() {
	super();
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
}
 
}
