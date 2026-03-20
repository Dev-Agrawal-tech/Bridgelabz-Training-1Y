package com.gla.string_api.level1;

import java.util.Scanner;

public class CompareSubStrings {

	public static String substringUsingCharAt(String str1, int startindex , int endindex) {
		String str ="";
		for(int i=startindex;i<endindex;i++) {
			str = str+ str1.charAt(i);
		}
		return str;
	}
	
	public static boolean compareSubstring(String substringCharAt, String substringmethod) {
		if(substringCharAt.length() != substringmethod.length()){
			return false;
		}
		
		for(int i=0;i<substringCharAt.length();i++) {
			if(substringCharAt.charAt(i)!=substringmethod.charAt(i)) {
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
		
		System.out.println("Enter Starting index  ");
		int startindex = sc.nextInt();
		
		System.out.println("Enter Ending index  ");
		int endindex = sc.nextInt();
		String substringCharAt = substringUsingCharAt(str1,startindex,endindex);
		
		String substringmethod = str1.substring(startindex, endindex);
		
		boolean compare = compareSubstring(substringCharAt,substringmethod);
		
		if(compare) {
			System.out.println("bothe substring is same");
		}
		else {
			System.out.println("bothe substring is same");
		}

		sc.close();
	}

}
