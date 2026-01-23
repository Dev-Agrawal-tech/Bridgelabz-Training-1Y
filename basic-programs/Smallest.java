

import java.util.Scanner;
public class Smallest{
	public static void Smallest(int num1 , int num2 , int num3){
		String result;
		if(num1<num2 && num1 <num3){
			result = "Yes";
		}
		else{
			result = "No";
		}
		System.out.println("Is the first number the smallest? "+ result );
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number 3 ");
		int num3 = sc.nextInt();
		
		Smallest(num1,num2,num3);
	}
}
