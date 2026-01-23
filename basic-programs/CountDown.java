import java.util.Scanner;
public class CountDown{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value where count down start ");
		int counter = sc.nextInt();
		System.out.println("Count down start - ");
		for(int i = counter ; i>1 ; i--){
			System.out.println(i);
		}
	}
}
