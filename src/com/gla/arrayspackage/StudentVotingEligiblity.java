package com.gla.arrayspackage;
import java.util.Scanner;
public class StudentVotingEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] ages=new int[10];
		
		System.out.println("Enter the age of 10 student");
		
		for(int i=0;i<ages.length;i++) {
			ages[i]=sc.nextInt();
		}
		
		for(int i=0;i<ages.length;i++) {
			if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } 
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
		}
	}

}
