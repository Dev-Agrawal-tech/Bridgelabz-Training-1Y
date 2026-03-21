package com.gla.classes_objects.Level1;

public class ItemValue {
	  int itemCode;
	    String itemName;
	    double price;

	    void display(int quantity) {
	        System.out.println("Item Code : " + itemCode);
	        System.out.println("Item Name : " + itemName);
	        System.out.println("Price     : " + price);
	        System.out.println("Quantity  : " + quantity);
	        System.out.println("Total Cost: " + (price * quantity));
	    }
	
	    public static void main(String[] args) {
	        ItemValue i = new ItemValue();

	        i.itemCode = 201;
	        i.itemName = "Pen";
	        i.price = 10;

	        i.display(5);
	    }
}
