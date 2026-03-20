package com.gla.string_api.level1;



public class NullPointer {
	public static void generate() {
		String text = null;
		
		System.out.println(text.length());
	}

	public static void handle() {
		try {
			String text = null;
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("handle");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 generate();
		 }
		 catch(Exception e){
		 }
		handle();

		
	}

}
