import java.util.Scanner;
public class BMIIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Weight in Kg ");
		double Weight = sc.nextDouble();
		
		System.out.print("Enter the height in cm ");
		double height = sc.nextDouble();
		height=height*0.01;
		double BMI = Weight/(height*height);
		
		if(BMI<18.4){
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI<=24.9){
			System.out.println("Normal");
		}
		else if(BMI>=25.0 && BMI<=39.9){
			System.out.println("Overweight");
		}
		else if(BMI>=40.0){
			System.out.println("Obese");
		}
	}
}

