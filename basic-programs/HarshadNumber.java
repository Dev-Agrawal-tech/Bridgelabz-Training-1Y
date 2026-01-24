import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		int number= num;
		int sum_digit=0;
		while(num>0){
			int res=num%10;
			sum_digit=sum_digit+res;
			num=num/10;
		}
		num=number;
		if(num%sum_digit==0){
			System.out.println("It is  a Harshad Number");
		}
		else{
			System.out.println("It is not a Harshad Number");
		}
	}
}