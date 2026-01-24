import java.util.Scanner;
public class Factors{

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
			for(int i=1;i<=num;i++){
				if(num%i==0){
					System.out.println( num +" is perfectly disible by " + i);
				}
			}
			
		}
		else{
			System.out.println("Please! Enter positive Number ");
		}
	}
}

