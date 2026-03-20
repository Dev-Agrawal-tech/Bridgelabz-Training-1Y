package com.gla.string_api.level2;

import java.util.Scanner;

public class LengthOfString {

	public static int lengthUsingMethod(String s) {
		int length=0;
		
		try {
			while(true) {
				s.charAt(length);
				length++;
			}
		}
		catch(Exception e){
			
		}
		return length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = sc.next();
		
		int length = s.length();
		
		int lengthmethod = lengthUsingMethod(s);
		
		 System.out.println("Length using built-in method: " + length);
	     System.out.println("Length using user-defined method: " + lengthmethod);
	        
	      sc.close();
		
		
	}

}
