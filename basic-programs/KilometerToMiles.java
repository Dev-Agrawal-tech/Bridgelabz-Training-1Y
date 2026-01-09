import java.util.Scanner;
public class  KilometerToMiles{
	public static void kilometer_to_miles(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter distance in kilometer ");
		int distance_in_kilometer = s.nextInt();
		
		double miles = distance_in_kilometer * 0.621371;
		System.out.println(miles);
	}
	public static void main(String[] args){
		kilometer_to_miles(); 
	}
}
