import java.util.Scanner;
public class AddToNumber{
	
	public static void add_to_number(){
		Scanner s = new Scanner(System.in);
		int num1 =s.nextInt();
		int num2=s.nextInt();
		int sum=num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args){
		add_to_number();
	}
}