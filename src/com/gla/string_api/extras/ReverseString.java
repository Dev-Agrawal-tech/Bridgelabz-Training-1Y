package com.gla.string_api.extras;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		 
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1 = s1 + s.charAt(i);
		}
		
		System.out.println("Reverse String " + s1);
		sc.close();

	}

}
