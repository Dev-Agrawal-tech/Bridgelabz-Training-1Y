package com.gla.string_api.extras;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String s= sc.nextLine();
		
		String s1="";
		
		for(int i=s.length();i>=0;i++) {
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1)) {
			System.out.print("Yes, Given String is Palindrome");
		}
		else {
			System.out.print("No, Given String is not Palindrome");
		}
		sc.close();
	}

}
