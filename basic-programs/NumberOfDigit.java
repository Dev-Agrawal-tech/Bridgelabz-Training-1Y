import java.util.Scanner;
public class NumberOfDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		int number=num;
		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		num=number;
		System.out.println("number of digits in " + num + " is " + count);
	}
}

