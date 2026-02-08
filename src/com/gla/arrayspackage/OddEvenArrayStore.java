package com.gla.arrayspackage;

import java.util.Scanner;

public class OddEvenArrayStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        
        if(number<0) {
        	 System.out.println("Please!! Enter a natural number ");
        	 return;
        }
        
        int[] evennumber = new int[number/2+1];
        int[] oddnumber  = new int[number/2+1];
        
        int index_even=0;
        int index_odd=0;
        
        for(int i=0;i<number;i++) {
        	if(i%2==0) {
        		evennumber[index_even]=i;
        		index_even++;
        	}
        	else {
        		oddnumber[index_odd]=i;
        		index_odd++;
        	}
        }
        
        
        for(int i=0;i<index_odd;i++) {
        	System.out.print(oddnumber[i] + " ");
        }
        
        System.out.println();
        for(int i=0;i<index_even;i++) {
        	System.out.print(evennumber[i] + " ");
        }

	}

}
