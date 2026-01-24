import java.util.Scanner;
public class EvenOdd{
public static boolean isNatural(int num){
		if(num<0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static void main(String[] args){
		System.out.print("Enter the value ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isNatural(num)){
			for(int i=1;i<=num;i++){
				if(i%2==0){
					System.out.println( i + " is Even Number");
				}
				else{
					System.out.println( i + " is Odd Number");
				}
			}
		}
		else{
		
		System.out.println("Enter number is wrong! ");
		System.out.println("Please enter natural number ");
		}
		
	}
}
