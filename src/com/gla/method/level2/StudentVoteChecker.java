package com.gla.method.level2;

import java.util.Scanner;

public class StudentVoteChecker {
	 public static boolean canVote(int age){
	        if(age<0){
	            return false;
	        }
	        if(age>=18){
	            return true;
	        }
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        for(int i=0;i<10;i++){
	            int age=sc.nextInt();
	            System.out.println(canVote(age));
	        }
	}

}
