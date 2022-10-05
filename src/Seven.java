

import java.util.Scanner;

public class Seven {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int totalhours, weeks, days, hours;
		
		System.out.println("How many hours would you like write?: ");
		totalhours = in.nextInt();
		
		weeks = totalhours / 168;
		days = totalhours % 168 / 24;
		hours = totalhours % 24;
		
		System.out.println("\nThe equivalent is: ");
		System.out.println("Weeks: " +weeks);
		System.out.println("Days: " +days);
		System.out.println("Hours: " +hours);
		
		
	}

}
