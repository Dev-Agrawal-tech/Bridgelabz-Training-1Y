package com.gla.classes_objects.Constructors_Level1;

import java.util.Arrays;

public class Book {
	 String title;
	    String author;
	    double price;
	    Book(String t, String a, double p) {
	        title = t;
	        author = a;
	        price = p;
	    }
	    void display() {
	        System.out.println(title + " - " + author + " - " + price);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = {
	            new Book("Java", "James", 500),
	            new Book("C++", "Bjarne", 300),
	            new Book("Python", "Guido", 400)
	        };
	        Arrays.sort(books, (b1, b2) -> Double.compare(b1.price, b2.price));
	        System.out.println("Books sorted by price:");
	        for (Book b : books) {
	            b.display();
	        }
	}

}
