import java.util.Scanner;
public class PerimeterOfRectangle{
	public static void perimeter_of_rectangle(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length ");
		int length = s.nextInt();
		System.out.print("Enter width ");
		int width = s.nextInt();
		int Perimeter_Of_Rectangle=2*(length*width);
		System.out.println(Perimeter_Of_Rectangle);
	}
	public static void main(String[] args){
		perimeter_of_rectangle(); 
	}
}
