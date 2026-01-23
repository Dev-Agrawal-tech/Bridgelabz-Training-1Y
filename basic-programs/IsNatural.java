import java.util.Scanner;
public class IsNatural{
	
	public static void sumOfNaturalNumber(int num){
		int result = num * (num+1)/2;
		System.out.print("The sum of " + num + " natural number is " + result);
	}
	public static void isNatural(int num){
		if(num<0){
			System.out.print("The number " + num + "is not a natural number");
		}
		else{
			sumOfNaturalNumber(num);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num= sc.nextInt();
		isNatural(num);
		
	}
}
