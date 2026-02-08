package com.gla.arrayspackage;

import java.util.Scanner;

public class MeanHeightFootballTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		double[] heights=new double[11];
		double sum=0;
		
		System.out.println("Enter the height of players : ");
		
		for(int i=0;i<heights.length;i++) {
			heights[i]=sc.nextDouble();
		}
		
		for(int i=0;i<heights.length;i++) {
			sum=sum+heights[i];
		}
		
		double mean=sum/heights.length;
		
		System.out.println("The mean height of 11 players is : " + mean);
		
		
	}

}
