import java.util.Scanner;
public class YoungestAndTallest{

	public static void isTallest(int height1, int height2 , int height3){
		if(height1>height2 && height1>height3){
			System.out.println("Amar is the Tallest friend");
		}
		else if(height2>height1 && height2>height3){
			System.out.println("Akbar is the Tallest friend");
		}
		else if(height3>height2 && height3>height1){
			System.out.println("Anthony is the Tallest friend");
		}
		
	}
	
	public static void isSmallest(int age1, int age2 , int age3){
		if(age1<age2 && age1<age3){
			System.out.println("Amar is the Youngest friend");
		}
		else if(age2<age1 && age2<age3){
			System.out.println("Akbar is the Youngest friend");
		}
		else if(age3<age1 && age3<age2){
			System.out.println("Anthony is the Youngest friend");
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age of Amar ");
		int age1 = sc.nextInt();
		System.out.print("Enter the Height of Amar ");
		int height1 = sc.nextInt();
		
		System.out.print("Enter the age of Akbar ");
		int age2 = sc.nextInt();
		System.out.print("Enter the Height of Akbar ");
		int height2 = sc.nextInt();
		
		System.out.print("Enter the age of Anthony ");
		int age3 = sc.nextInt();
		System.out.print("Enter the Height of Anthony ");
		int height3 = sc.nextInt();
		
		isSmallest(age1,age2,age3);
		isTallest(height1,height2,height3);
	}
}

