import java.util.Scanner;
public class Counter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value where count down start ");
		int counter = sc.nextInt();
		System.out.println("Count down start - ");
		while(counter>1){
			System.out.println(counter);
			counter--;
		}
		
	}
}
