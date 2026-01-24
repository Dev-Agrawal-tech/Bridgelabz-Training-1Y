import java.util.Scanner;
public class BonusSalary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salary ");
		int Salary = sc.nextInt();
		System.out.print("Enter the Year of Service ");
		int year_of_salary = sc.nextInt();
		double bonus_amount=0;
		if(year_of_salary >=5){
			bonus_amount = Salary * 0.05;
			
		}
		else{
			System.out.println("Sorry!! yor are not eligible for bonus ");
		}
			System.out.println("Your bonus amount is " + bonus_amount);
	}
}
