import java.util.Scanner;
public class FizzBuzz{

	public static boolean isDivisibleBy5(int num){
		if(num%5==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isDivisibleBy3(int num){
		if(num%3==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPositive(int num){
		if(num>0){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		if(isPositive(num)){
			if(isDivisibleBy3(num) && isDivisibleBy5(num)){
				System.out.println("FizzBuzz");
			}
			else if (isDivisibleBy3(num) ){
				System.out.println("Fizz");
			}
			else if (isDivisibleBy5(num)){
				System.out.println("Buzz");
			}
			else{
				System.out.println(num);
			}
		}
	}
}

