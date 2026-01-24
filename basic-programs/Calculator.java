import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number ");
		Double first = sc.nextDouble();
		
		System.out.print("Enter the number ");
		Double second = sc.nextDouble();
		
		System.out.println("Enter + for Addition");
		System.out.println("      - for Subtraction");
		System.out.println("      * for Multiplication");
		System.out.println("      / for Division");
		System.out.print("Enter the operator  : ");
		
		String op = sc.next();
		
		switch (op){
			case("+") :
				System.out.println("Addition of two number is " + (first+second));
				break;
			case("-") :
				System.out.println("Subtraction of two number is " + (first-second));
				break;
			case("*") :
				System.out.println("Multiplication of two number is " + first*second);
				break;
			case("/") :
				System.out.println("Division of two number is " + first/second);
				break;
			default:
				System.out.println("Invalid input ");
				break;
		}
		
		
	}
}