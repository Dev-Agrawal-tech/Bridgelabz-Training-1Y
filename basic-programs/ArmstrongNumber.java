import java.util.Scanner;
public class ArmstrongNumber{
	public static int isArmstrong(int num){
		int number=num;
		int length=0;
		while(num>0){
			num=num/10;
			length++;
		}
		num=number;
		
		int sum=0;
		for(int i=0;i<length;i++){
			int power=1;
			int rem=num%10;
			for(int j=1;j<=length;j++){
				power=power*rem;
			}
			sum=sum+power;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		if(num==isArmstrong(num)){
			System.out.print(num + " is Armstrong number ");
		}
		else{
			System.out.print(num + " is not a Armstrong number ");
		}
	}
}

