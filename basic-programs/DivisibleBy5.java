import java.util.Scanner;
public class DivisibleBy5{

	public static void divisibleby5(int num){
	String result;
		if(num%5==0){
			result = "Yes";
		}
		else{
			result = "No";
		}
		System.out.println("Is the number " + num + " divisible by 5? "+ result );
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		
		divisibleby5(num);
	}
}