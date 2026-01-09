// simple Interst = principal*rate*time/100

import java.util.Scanner;
public class SimpleInterest{
	public static void simple_interest(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter priciple ");
		int priciple = s.nextInt();
		System.out.print("Enter rate ");
		double rate = s.nextDouble();
		System.out.print("Enter time ");
		int time = s.nextInt();
		double Simple_Interest=(priciple * rate * time)/100;
		System.out.println(Simple_Interest);
	}
	public static void main(String[] args){
		simple_interest();
	}
}
