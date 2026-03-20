package com.gla.string_api.level1;

import java.util.Scanner;

public class ConvertLowerClass {
	
public static String convertLowercase(String s) {
		
		String result="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c>='a' && c<='z') {
				c =(char)(c+32);
			}
			
			result = result + c;
		}
		return result;
		
	}
	
	public static boolean compareArrays(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!= str2.charAt(i)) {
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
		
		
		String c = convertLowercase(str1);
		
		String s = str1.toLowerCase();
		
		boolean result = compareArrays(c,s);
		 
        if(result) {
        	System.out.println("Both character arrays are equal.");
        }
        else {
        	 System.out.println("Character arrays are not equal.");
        }
        sc.close();
	}

}
