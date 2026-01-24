import java.util.Scanner;
public class PowerCalculation2_1{
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
			int counter=num-1;
			while(counter>1){
				
				if(num%counter==0){
					System.out.println(counter + "is divide the " + num );
					
				}
				
				counter--;
			}
			
		}
		else{
			System.out.println("Please!!, Enter positive value");
		}
		
		
		
	}
}

