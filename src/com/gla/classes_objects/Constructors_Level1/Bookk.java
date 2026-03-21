package com.gla.classes_objects.Constructors_Level1;

public class Bookk {
	 String title;
	    String author;
	    double price;
	    boolean available;
	    public Bookk(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = true;   
	    }
	    void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("Book borrowed successfully.");
	        } else {
	            System.out.println("Book is not available.");
	        }
	    }
	    void display() {
	        System.out.println("Title       : " + title);
	        System.out.println("Author      : " + author);
	        System.out.println("Price       : " + price);
	        System.out.println("Available   : " + (available ? "Yes" : "No"));
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Bookk b1 = new Bookk("Java Basics", "James Gosling", 450);
	        b1.display();
	        b1.borrowBook();  
	        b1.display();
	        b1.borrowBook();   
	    }
}
