package com.gla.arrayspackage;

import java.util.Scanner;

public class StoreAndSumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc= new Scanner (System.in);
			
			double[] number=new double[10];
			double total=0.0;
			int index=0;
			
			while(true) {
				System.out.println("Enter any number");
				double num=sc.nextInt();
				
				if(num<=0) {
					System.out.println("Stop taking value because of invalid input ");
					break;
				}
				
				if(index==10) {
					System.out.println("You reached Array size (10 numbers)");
					break;
				}
				
				number[index]=num;
				index++;
			}
			for(int i=0;i<index;i++) {
				System.out.println("at index "+ i + "the value is "+ number[i]);
				total=total+number[i];
			}
			
			System.out.println("The sum o all elements of array " + total );
			

	}

}
