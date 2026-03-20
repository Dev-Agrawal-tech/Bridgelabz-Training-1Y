package com.gla.method.level2;

import java.util.Scanner;

public class LeapYear {
	  public static boolean check(int y){
	        if(y<1582){
	            return false;
	        }
	        if(y%400==0){
	            return true;
	        }
	        if(y%100==0){
	            return false;
	        }
	        return y%4==0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int y=sc.nextInt();
	        System.out.println(check(y));
	}

}
