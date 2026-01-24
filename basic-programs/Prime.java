import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		int prime=1;
		if(num==0 || num==1){
			System.out.println(num + " is not a prime number");
		}
		else{
			if(num<0){
				System.out.println("Enter a positive number ");
			}
			else{
				for(int i=2;i<num;i++){
					if(num%i==0){
						prime=0;
						break;
					}
					else{
						prime=1;
					}
				}
			}
			if(prime==1){
				System.out.println(num + " is a prime number");
			}
			else{
				System.out.println(num + " is not a prime number");
			}
		
		}

	}
}

