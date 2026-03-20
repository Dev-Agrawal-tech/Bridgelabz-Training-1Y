package com.gla.string_api.extras;

import java.util.Scanner;

public class LongestWord {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner (System.in);
		System.out.print("Enter a sentence : ");
		String s= sc.nextLine();
		
		String[] s1= s.split(" ");
		String longest = "";
		
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length() > longest.length()) {
				longest =   s1[i];
			}
		}
		
		System.out.println("Longest word in string : "  + longest);
		
	}
}
