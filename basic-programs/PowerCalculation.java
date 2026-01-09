

import java.util.Scanner;
public class PowerCalculation{
	public static int power_calculation(int base , int exponent){
		
		if(exponent==0){
			return 1;
		}
		else if(base ==0 ){
			return 0;
		}
		else{
			return base*power_calculation(base,exponent-1);
		}
		
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter base value ");
		int base = s.nextInt();
		System.out.print("Enter exponent value ");
		int exponent = s.nextInt();
		int result = power_calculation(base , exponent);
		System.out.println(result);
	}
}
