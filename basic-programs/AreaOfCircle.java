import java.util.Scanner;
public class AreaOfCircle{
	public static void area(){
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double areaofcicle=3.14 * radius * radius;
		System.out.println(areaofcicle);
	}
	public static void main(String[] args){
	
		area();
	}
}
