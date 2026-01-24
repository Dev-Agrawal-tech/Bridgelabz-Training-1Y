import java.util.Scanner;
public class PowerCalculation2{
	public static boolean isPositive(int num){
				if(num>0){
					return true;
				}
				else{
					return false;
				}
			}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		
		System.out.print("Enter the value of power ");
		int power= sc.nextInt();
		
		int result=1;
		
		if(isPositive(num)){
			for(int i=1;i<=power;i++){
				result=result*num;
			}
		}
		else{
			System.out.println("Please!!, Enter positive value");
		}
		
		System.out.println(num + " to the power of " + power + " is " + result);
		
	}
}

