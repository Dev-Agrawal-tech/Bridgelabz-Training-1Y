package com.gla.string_api.level1;

import java.util.Scanner;

public class ArrayIndex {

	public static void generate(String[] names) {
		System.out.println(names[names.length]);
	}
	
	public static void handle(String[] names) {
		try {
			System.out.println(names[names.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] names = new String[n];
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		try {
			generate(names);
		}
		catch(Exception e){
			
		}
		handle(names);
		sc.close();
	}

}
