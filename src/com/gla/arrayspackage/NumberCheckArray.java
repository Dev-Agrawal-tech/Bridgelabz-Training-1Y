package com.gla.arrayspackage;

import java.util.Scanner;

public class NumberCheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		
		System.out.println("Enter 5 numbers ");
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++) {
			if (num[i] > 0) {
                System.out.print(num[i] + " is Positive Number");
                if(num[i]%2==0) {
                	System.out.println(" and even");
                }
                else {
                	System.out.println(" and odd ");
                }
            } 
            else if (num[i] == 0) {
                System.out.println(num[i] + " is Zero");
            } 
            else {
                System.out.println(num[i] + " is negative ");
            }
		}
		
		int first=num[0];
		int last=num[num.length-1];
		
		if (first == last) {
            System.out.println("First element (" + first + ") is Equal to Last element (" + last + ").");
        } 
        else if (first > last) {
            System.out.println("First element (" + first + ") is Greater than Last element (" + last + ").");
        } 
        else {
            System.out.println("First element (" + first + ") is Less than Last element (" + last + ").");
        }
	}

}
