import java.util.Scanner;

public class Five {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		float participation, test1, test2, test3, total;

		System.out.println("Write the grade for participation: ");
		participation = in.nextFloat();
		
		System.out.println("Write the grade for test1: ");
		test1 = in.nextFloat();
		
		System.out.println("Write the grade for test2: ");
		test2 = in.nextFloat();
		
		System.out.println("Write the grade for test3: ");
		test3 = in.nextFloat();
		
		/* 
		 another way 
		 participation *= 0.10f;
		 test1 *= 0.25f;
		 test2 *= 0.25f;
		 test3 *= 0.40f; 
		 
		 total = participation + test1 + test2 + test3;
		 */
		
		total = (participation * 0.10f) + (test1 * 0.25f) + (test2 * 0.25f) + (test3 * 0.4f);
		
		System.out.println("Final grade is: " + total);
		
	}
}
