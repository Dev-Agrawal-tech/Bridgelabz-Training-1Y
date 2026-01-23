
import java.util.Scanner;
public class Factorial2{
	public static boolean positiveNumber(int num){
		if(num<0){
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value ");
		int num=sc.nextInt();
		int fact=1;
		int number=num;
		if(positiveNumber(num)){
			for(int i=num;i>0;i--){
				fact=fact*i;
			}
		}
		else{
			System.out.println("You entered wrong number , ");
			System.out.println("Please! Enter Positive number . ");
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}
}
