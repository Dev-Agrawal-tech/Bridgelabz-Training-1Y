package com.gla.string_api.level1;

import java.util.Scanner;

public class CompareToString {
	
	public static boolean compareUsingCharAt(String str1, String str2) {
	 	if(str1.length()!=str2.length()) {
	 		return false;
	 	}
	 	
	 	for(int i=0;i<str1.length();i++) {
	 		if(str1.charAt(i)!=str2.charAt(i)) {
	 			return false;
	 		}
	 	}
	 	return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String ");
		String str1 = sc.next();
		
		System.out.println("Enter First String ");
		String str2 = sc.next();
		
		boolean resultCharAt = compareUsingCharAt(str1,str2);
		
		boolean resultEquals= str1.equals(str2);
		
		if(resultCharAt==resultEquals) {
			System.out.println("Both methods given same result");
		}else {
			System.out.println("Results are different");
		}
		sc.close();
	}

}
