package com.gla.arrayspackage;

import java.util.Scanner;

public class FizzBuzzArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a  number: ");
        int number = sc.nextInt();
        //check for positive integer
        
        if(number<0) {
        	System.out.println("Enter a positive number ");
        	return;
        }
        // Create a string array to store array
        String[] result= new String[number];
        
        //Loop from 0 to number to save Fizzbuzz condition
        for(int i=0;i<number;i++) {
        	if(i%3==0 && i%5==0) {
        		result[i]="FizzBuzz";
        	}
        	else if(i%3==0) {
        		result[i]="Fizz";
        	}
        	else if (i%5==0) {
        		result[i]="Buzz";
        	}
        	else {
        		result[i]=String.valueOf(i);
        	}
        }
        
        // Print the loop with positions
        System.out.println("Fizzbuzz Result : ");
        for(int i=0;i<number;i++) {
        	System.out.println("Position " + i + " = " + result[i]);
        }
	}

}
