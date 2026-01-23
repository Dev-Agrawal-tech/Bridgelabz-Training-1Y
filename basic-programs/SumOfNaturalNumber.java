import java.util.Scanner;
public class SumOfNaturalNumber{

	public static int SumOfNaturalNumberUsingFormula(int num){
		int total_formula= num*(num+1)/2;
		return total_formula;
	}
	public static int SumOfNaturalNumberUsingLoop(int num){
		int total=0;
		while(num>0){
			total=total+num;
			num--;
		}
		return total;
		
		//int total_formula=SumOfNaturalNumberUsingFormula(num);
	}
	public static boolean isNatural(int num){
		if(num<0){
			
			//System.out.println("It's not a natural number");
			
			return false;
		}
		else{
			
			//SumOfNaturalNumberUsingLoop(num);
			
			return true;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value ");
		int num = sc.nextInt();
		
		//isNatural(num);
		
		if(isNatural(num)){
			int total_From_loop=SumOfNaturalNumberUsingLoop(num);
			int total_From_Formula=SumOfNaturalNumberUsingFormula(num);
			
			if(total_From_loop==total_From_Formula){
				System.out.println(total_From_Formula);
			}
			
		}
		else{
			System.out.println("It's not a natural number");
		}
	}
}
