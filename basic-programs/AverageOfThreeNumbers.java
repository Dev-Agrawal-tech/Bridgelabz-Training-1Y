import java.util.Scanner;
public class AverageOfThreeNumbers{
	public static void average_of_three_number(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number 1 ");
		int num1 = s.nextInt();
		System.out.print("Enter number 2 ");
		int num2= s.nextInt();
		System.out.print("Enter number 3 ");
		int num3= s.nextInt();
		float average = (num1 + num2 + num3) / 3 ;
		System.out.println(average);
	}
	public static void main(String[] args){
		average_of_three_number(); 
	}
}
