import java.util.Scanner;
public class Factors_while{

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
		
		if(isPositive(num)){
			int counter=1;
			while(counter<=num){
				if(num%counter==0){
					System.out.println( num +" is perfectly disible by " + counter);
				}
				counter++;
			}
			
		}
		else{
			System.out.println("Please! Enter positive Number ");
		}
	}
}

