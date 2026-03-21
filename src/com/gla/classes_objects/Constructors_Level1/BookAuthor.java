package com.gla.classes_objects.Constructors_Level1;

public class BookAuthor {
	 public String ISBN;        
	    protected String title;   
	    private String author;     

	    void Book(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    public String getAuthor() {
	        return author;
	    }
}
