/* make a program for (a+b)2 = a2 + b2 + 2*a*a */

import java.util.Scanner;

public class Six {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		double a, b, result;
		
		System.out.println("Write a number to the variable a: ");
		a = in.nextDouble();
		
		System.out.println("Write a number to the variable b:");
		b = in.nextDouble();
	
		result = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a *b);
		
		System.out.println("The result is: " +result);
	}

}
