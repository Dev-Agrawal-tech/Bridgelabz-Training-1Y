import java.util.Scanner;
public class GradesOfSubjects{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the  marks of each subject ");
		int Marks=sc.nextInt();
		
		System.out.print("Enter the physics marks ");
		int physics_marks=sc.nextInt();
		
		System.out.print("Enter the chemistry marks ");
		int chemistry_marks=sc.nextInt();
		
		System.out.print("Enter the math marks ");
		int math_marks=sc.nextInt();
		Marks=Marks*3;
		double sum_of_marks=physics_marks + chemistry_marks + math_marks;
		double average = ((physics_marks + chemistry_marks + math_marks)/Marks) *100;
		
		if(average>=80){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : A ");
			System.out.println("Remarks : Level 4, above agency-normalized standards)");
		}
		else if(average>=70 && average<=79){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : B ");
			System.out.println("Remarks : Level 3, at agency-normalized standards)");
		}
		else if(average>=60 && average<=69){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : C ");
			System.out.println("Remarks : Level 2, but approching agency-normalized standards)");
		}
		else if(average>=50 && average<=59){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : D ");
			System.out.println("Remarks : Level 1, well below agency-normalized standards)");
		}
		else if(average>=40 && average<=49){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : E ");
			System.out.println("Remarks : Level 3, too below agency-normalized standards)");
		}
		else if(average<=39){
			System.out.println("Average Marks " + average);
			System.out.println("Grade : R ");
			System.out.println("Remarks : Remedial standards)");
		}
		
	}
}

