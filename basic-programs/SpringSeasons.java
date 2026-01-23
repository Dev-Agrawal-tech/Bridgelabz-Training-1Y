import java.util.Scanner;
public class SpringSeasons{

	public static void SpringMonth(int Date , String Month){
	if(Month.equals("March") || Month.equals("march")){
		if(Date>=20 && Date<=31){
			System.out.print("It's a Spring Season");
		}
		else {
			System.out.print("It's not a Spring Season");
		}
	}
	else if(Month.equals("April") || Month.equals("april")){
		if(Date>=1 && Date<=30){
			System.out.print("It's a Spring Season");
		}
		else {
			System.out.print("It's not a Spring Season");
		}
	}
	else if(Month.equals("May") || Month.equals("may")){
		if(Date>=1 && Date<=30){
			System.out.print("It's a Spring Season");
		}
		else {
			System.out.print("It's not a Spring Season");
		}
	}
	else if(Month.equals("June") || Month.equals("june")){
		if(Date>=1 && Date<=20){
			System.out.print("It's a Spring Season");
		}
		else {
			System.out.print("It's not a Spring Season");
		}
	}
	else{
		System.out.print("It's not a Spring Season");
	}
	
	
	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date ");
		int Date= sc.nextInt();
		System.out.print("Enter the Month ");
		String Month = sc.next();
		SpringMonth(Date,Month);
		
	}
}
