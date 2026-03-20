package com.gla.string_api.level1;

import java.util.Scanner;

public class Stringindex {
	
	public static void generate(String s) {
		System.out.println(s.charAt(s.length()));
	}

	public static void handle(String s) {
		try {
			System.out.println(s.charAt(s.length()));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string : ");
		String s1= sc.next();
	   try {
		   generate(s1);
	   }
	   catch(Exception e) {
		   
	   }
	   handle(s1);
	   
	   sc.close();
	}

}
