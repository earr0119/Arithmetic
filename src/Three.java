import java.util.Scanner;

public class Three {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		float guillermo, luis, juan, total;
		
		System.out.println("How much money Does Guillermo have?: ");
		guillermo = in.nextFloat();
		
		luis = guillermo / 2;
		juan =(guillermo + luis)/2;
		
		total = guillermo + luis + juan;

		System.out.println("The amount of money between the three is: $ " +total);
		
		
	}

}
