import java.util.Scanner;
public class PositiveNegativeNumber{
	public static void isPostive_Negative_Zero(int num){
		if(num>0){
			System.out.print("Number is Positive ");
		}
		else if (num==0){
			System.out.print("Number is Zero");
		}
		else{
			System.out.print("Number is Negative");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		isPostive_Negative_Zero(num);
	}
}

