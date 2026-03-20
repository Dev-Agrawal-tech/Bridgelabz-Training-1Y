package com.gla.string_api.extras;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		
		HashSet<Character> hashs= new HashSet<>();
		
		String newString = "";
		for(int i=0;i<s.length();i++) {
			char  ch = s.charAt(i);
			
			if(!hashs.contains(ch)) {
				hashs.add(ch);
				newString = newString+ch;
			}
			
		}
		System.out.println("String after removing duplicaties " + newString);
		
		
		
	}

}
