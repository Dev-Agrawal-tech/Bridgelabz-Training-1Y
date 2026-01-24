import java.util.Scanner;
public class MultipliOfNumber{
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
		if(num<100 && isPositive(num)){
			for(int i=100 ; i>=1;i--){
				if(i%num==0){
					System.out.println(i+ " perfectely divisible by " + num );
					continue;
				}
			}
		}
		
	}
}

