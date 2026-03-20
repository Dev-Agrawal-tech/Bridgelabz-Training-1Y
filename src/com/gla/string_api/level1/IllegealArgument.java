package com.gla.string_api.level1;

import java.util.Scanner;

public class IllegealArgument {
	public static void generate(String s, int start, int end) {
		System.out.println(s.substring(start,end));
	}
	
	public static void handle(String s, int start , int end ) {
		try {
			System.out.println(s.substring(start,end));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string : ");
		String s1= sc.next();
		System.out.println("Enter a Start index : ");
		int startindex = sc.nextInt();
		System.out.println("Enter a end index : ");
		int endindex = sc.nextInt();
		
		try {
			generate(s1,startindex,endindex);
		}
		catch(Exception e) {
			
		}
		handle(s1,startindex,endindex);
		sc.close();
	}

}
