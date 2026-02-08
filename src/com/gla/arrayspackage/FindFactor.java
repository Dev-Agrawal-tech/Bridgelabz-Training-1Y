package com.gla.arrayspackage;

import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a  number: ");
        int number = sc.nextInt();
        
        int maxFactor=10;
        int[] factor=new int[maxFactor];
        int index=0;
        
        for(int i=1;i<=number;i++) {
        	 if(number%i==0) {
        		 if(index==maxFactor) {
        			 maxFactor=maxFactor*2;
        			 int[] temp=new int[maxFactor];
        			 
        			 for(int j=0;j<factor.length;j++) {
        				 temp[j]=factor[j];
        			 }
        			 
        			 factor=temp;
        		 }
        		  factor[index]=i;
        		  index++;
        	 }
        }
        
        for(int i=0;i<index;i++) {
        	System.out.print(factor[i]+ " ");
        }

	}

}
