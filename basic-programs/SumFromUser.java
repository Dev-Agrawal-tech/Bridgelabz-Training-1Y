import java.util.Scanner;
public class SumFromUser 	{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total=0.0;
		double num;
		
		while(true){
			System.out.print("Enter the value ");
			num= sc.nextDouble();
			if(num==0 || num<0 ){
				break;
			}
			else{
				total=total+num;
			}
		}
		System.out.println(total);
	}
}
