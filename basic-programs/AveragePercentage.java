public class AveragePercentage{
	public static double physics_percentage (double physics_mark){
		return (physics_mark/100)*100;
	}
	public static double math_percentage (double math_mark){
		return (math_mark/100)*100;
	}
	public static double chemistry_percentage (double chemistry_mark){
		return (chemistry_mark/100)*100;
	}
	
	public static double average (double physics_mark,double math_mark , double chemistry_mark){
		double average = (physics_percentage(physics_mark) + math_percentage(math_mark) + chemistry_percentage(chemistry_mark))/3;
		return average;
	}
	public static void main(String[] args){
		double physics_mark=95;
		double math_mark=94;
		double chemistry_mark=96;
		double average = average(physics_mark,math_mark,chemistry_mark);
		System.out.println("Sam's average marks in PCM is "+ average);
	}
	
}