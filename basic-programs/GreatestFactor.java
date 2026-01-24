import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		
		int greatest_factor=1;
		for(int i=num-1; i>=1 ; i--){
			if(num%i==0){
					greatest_factor=i;
					break;
				}
		}
		
		System.out.println( num +" is perfectly disible by " + greatest_factor);
	}
}

