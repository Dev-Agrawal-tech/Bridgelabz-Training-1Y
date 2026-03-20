package com.gla.method.level1;

import java.util.Scanner;

public class HandShakes {
	 public static int count(int n){
	        return n*(n-1)/2;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        System.out.println(count(n));
	}

}
