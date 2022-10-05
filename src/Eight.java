

import java.util.Scanner;

public class Eight {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		double a, b, c, result0, result1;
		
		System.out.println("Write a number to variable a: ");
		a = in.nextDouble();
		
		System.out.println("Write a number to variable b: ");
		b = in.nextDouble();
	
		System.out.println("Write a number to variable c: ");
		c = in.nextDouble();
		
		result0 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		result1 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		System.out.println("\nRoot number1 is: " +result0);
		System.out.println("\nRoot number2 is: " +result1);
	
	
	}

}
