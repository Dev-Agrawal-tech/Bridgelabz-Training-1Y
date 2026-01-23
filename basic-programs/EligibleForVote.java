import java.util.Scanner;
public class EligibleForVote{
	public static void canVote(int age){
		if(age>=18){
			System.out.print("The person's age is " + age + " and can Vote");
		}
		else{
			System.out.print("The person's age is " + age + " and cannot Vote");
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age ");
		int age = sc.nextInt();
		canVote(age);
	}
}