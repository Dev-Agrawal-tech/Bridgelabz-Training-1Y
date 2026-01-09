import java.util.Scanner;
public class VolumeOfCylinder{
	public static void volume(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius ");
		double radius = s.nextDouble();
		System.out.print("Enter height ");
		double height = s.nextDouble();
		double volume_of_cylinder=3.14 * radius * radius * height;
		System.out.println(volume_of_cylinder);
	}
	public static void main(String[] args){
		volume();
	}
}
