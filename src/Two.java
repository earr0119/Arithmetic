import java.util.Scanner;

public class Two {
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		
		double hours;
		double days;
		double salary;
		double result;
		
		System.out.println("How many hours do you work per day?: ");
		hours = in.nextDouble();
		
		System.out.println("How much does your hours cost?: ");
		salary = in.nextDouble();
		
		System.out.println("How many days did you work this week?: ");
		days = in.nextDouble();
		
		result = (days * hours) * salary; 
		
		System.out.println("You make: $ " +result);
	}

}
