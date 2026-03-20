package com.gla.string_api.extras;

import java.util.Scanner;

public class CountVowelsandConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		String s=sc.next();
		int volwel = 0;
		int constant =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'  
			|| s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				volwel++;
			}
			else {
				constant++;
			}
		}
		
		System.out.println("Vowel in String " + volwel);
		System.out.println("Constant in String " + constant);
	}

}
