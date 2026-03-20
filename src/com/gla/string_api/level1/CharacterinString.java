package com.gla.string_api.level1;

import java.util.Scanner;

public class CharacterinString {

	
	public static char[] stringtocharacter(String str1) {
		
		char[] result = new char[str1.length()];
		
		for(int i=0 ;i<str1.length();i++) {
			result[i] = str1.charAt(i);
		}
		
		return result;
		
		
	}
	
	public static boolean compareArrays(char[] arr1, char[] arr2) {
		if(arr1.length != arr2.length){
			return false;
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
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
		
		char[] s = stringtocharacter(str1);
		char[] ch = str1.toCharArray();
		
		   boolean result = compareArrays(s,ch);
  
	        System.out.print("Characters using user-defined method: ");
	        for (char c : s) {
	            System.out.print(c + " ");
	        }

	        System.out.println();

	      
	        System.out.print("Characters using toCharArray(): ");
	        for (char c : ch) {
	            System.out.print(c + " ");
	        }

	        System.out.println();
	        
	        if(result) {
	        	System.out.println("Both character arrays are equal.");
	        }
	        else {
	        	 System.out.println("Character arrays are not equal.");
	        }
		
	        sc.close();
		

	}

}
