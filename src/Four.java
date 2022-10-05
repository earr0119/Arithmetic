import java.util.Scanner;

public class Four {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	
		final int salary = 1000;
		int commission;
		float carvalue, totalsalary;
		
		
		System.out.println("How many cars have you sold?: ");
		commission = in.nextInt();
		
		System.out.println("How much does the car cost?: ");
		carvalue = in.nextFloat();
		
		totalsalary = salary + (commission * 150) + (0.05f * carvalue * commission);
		
		System.out.println("The employee's salary is: $ " +totalsalary);
		
	}
}
