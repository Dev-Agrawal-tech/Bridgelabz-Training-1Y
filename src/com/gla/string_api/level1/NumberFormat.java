package com.gla.string_api.level1;

import java.util.Scanner;

public class NumberFormat {

	public static void generate(String s) {
		int n= Integer.parseInt(s);
		System.out.println(n);
	}
	public static void handle(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e){
			System.out.println("handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1= sc.next();
		
		try {
			generate(s1);
		}
		catch(NumberFormatException e){
			
		}
		handle(s1);
		sc.close();
	}

}
