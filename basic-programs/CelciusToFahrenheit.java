import java.util.Scanner;
public class CelciusToFahrenheit{
	public static int conversion(int Celcius){
		int Fahrenheit =(Celcius*9/5)+32;
		return Fahrenheit;
	}
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int Celcius = s.nextInt();
		
		System.out.println(conversion(Celcius));
	}
}
