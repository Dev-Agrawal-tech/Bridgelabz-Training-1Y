
import java.util.Scanner;
public class SumUntil0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value ");
		double total=0.0;
		System.out.print("Enter the value ");
		double num= sc.nextDouble();
		total=total+num;
		while(num!=0.0){
			System.out.print("Enter the value ");
			num= sc.nextDouble();
			total=total+num;
		}
		System.out.println(total);
	}
}
