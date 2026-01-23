import java.util.Scanner;
public class LargestOfThree{
	public static void Largest(int num1 , int num2 , int num3){
			String result1;
			String result2;
			String result3;
			if(num1>num2 && num1>num3){
					result1="Yes";
					
			}
			else{
				result1="No";
			}
			
			if (num2>num1&& num2>num3 ){
				result2="Yes";
				
			}
			else{
				result2="No";
			}
			
			if (num3>num1 && num3>num2){
				result3="Yes";
				
			}
			else{
				result3="No";
			}
			
			System.out.println("Is the first number the largest? "+ result1 );
			System.out.println("Is the first number the largest? "+ result2 );
			System.out.println("Is the first number the largest? "+ result3 );
			
		}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number 3 ");
		int num3 = sc.nextInt();
		
		Largest(num1,num2,num3);
	}
}

