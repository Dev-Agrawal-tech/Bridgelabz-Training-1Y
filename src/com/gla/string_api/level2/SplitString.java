package com.gla.string_api.level2;

import java.util.Scanner;

public class SplitString {
	
	public static int Length(String s) {
		int length=0;
		
		try {
			while(true) {
				s.charAt(length);
				length++;
			}
		}
		catch(Exception e) {
			return length;
		}
	}
	

	
	public static String[] split(String s) {
		int length = Length(s);
		int spacesindex =1;
		for(int i=0;i<length;i++) {
			if(s.charAt(i)==' ') {
				spacesindex++;
			}
		}
		
		String[] words = new String[spacesindex];
		
		int index=0;
		int start=0;
		for(int i=0;i<=length;i++) {
			if(i==length || s.charAt(i)==' ') {
				String word ="";
				for(int j=start;j<i;j++) {
					word=word+s.charAt(j);
				}
				words[index]=word;
				index++;
				start=i+1;
			}
		}
		return words;
	}
	
	public static boolean compare(String[] s1 , String[] s2) {
		if(s1.length != s2.length) {
			return false;
		}
		
		for(int i=0;i<s1.length;i++) {
			if(!s1[i].equals(s2[i])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = sc.nextLine();
		
		int length=Length(s);
		
		System.out.println(compare(split(s),s.split(" ")));
		
		sc.close();

	}
	
	

}
