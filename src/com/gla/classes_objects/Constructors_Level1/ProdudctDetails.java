package com.gla.classes_objects.Constructors_Level1;

public class ProdudctDetails {
	 String productName;
	    double price;
	    static int totalProducts = 0;
	    ProdudctDetails(String name, double price) {
	        this.productName = name;
	        this.price = price;
	        totalProducts++;  
	    }
	    void displayProductDetails() {
	        System.out.println("Product: " + productName);
	        System.out.println("Price  : " + price);
	        System.out.println();
	    }
	    static void displayTotalProducts() {
	        System.out.println("Total Products: " + totalProducts);
	    }

	    public static void main(String[] args) {
	    	ProdudctDetails p1 = new ProdudctDetails("Laptop", 55000);
	        ProdudctDetails p2 = new ProdudctDetails("Mouse", 500);
	        ProdudctDetails p3 = new ProdudctDetails("Keyboard", 1200);
	        p1.displayProductDetails();
	        p2.displayProductDetails();
	        p3.displayProductDetails();
	        ProdudctDetails.displayTotalProducts();
	    }
}
