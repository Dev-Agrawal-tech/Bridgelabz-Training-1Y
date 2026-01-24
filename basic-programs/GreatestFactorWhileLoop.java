import java.util.Scanner;
public class GreatestFactorWhileLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		int counter=num-1;
		int greatest_factor=1;
		
		while(counter>=1){
				if(num%counter==0){
					greatest_factor=counter;
					break;
				}
				counter--;
			}
		
		System.out.println( num +" is perfectly disible by " + greatest_factor);
	}
}

