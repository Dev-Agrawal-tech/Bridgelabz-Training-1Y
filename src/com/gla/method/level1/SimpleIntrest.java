package com.gla.method.level1;

import java.util.Scanner;

public class SimpleIntrest {
	 public static double calculate(double p,double r,double t){
	        return p*r*t/100;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        double p=sc.nextDouble();
	        double r=sc.nextDouble();
	        double t=sc.nextDouble();
	        double si=calculate(p,r,t);
	        System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate "+r+" and Time "+t);
	}

}
