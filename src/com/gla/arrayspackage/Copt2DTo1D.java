package com.gla.arrayspackage;

import java.util.Scanner;

public class Copt2DTo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter a  number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter a  number of Columns: ");
        int column = sc.nextInt();
        int[][] matrix = new int[rows][column];
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<column;j++) {
        		
        		matrix[i][j]=sc.nextInt();
        	}
        }
        
        int[] array = new int[rows*column];
        int index=0;
        // converting 2D array into 1D array
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<column;j++) {
        		
        		array[index]=matrix[i][j];
        		index++;
        	}
        }
        
       // display 2D array
        System.out.println("Display 2D matrix");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<column;j++) {
        		
        		System.out.print(matrix[i][j] + " ");
        	}
        	System.out.println();
        }
        
        System.out.println("Display 1D array");
        for(int i=0;i<index;i++) {
        	System.out.print(array[i] + " ");
        }
	}

}
