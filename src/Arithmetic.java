import java.util.Scanner;
public class Arithmetic {

	

	   
	    public static void main(String args[]) {
	       Scanner entry = new Scanner(System.in);
	       float number1, number2, addition, substraction, multiplication, division, remainder;
	       String name = "";
	       
	       System.out.print("**************************************");
	       System.out.print("*Welcome to Mathematics Olympics Game*");
	       System.out.print("**************************************");
	       System.out.println("");
	       System.out.println("");
	      
	       System.out.print("I would like to know your fullname: ");
	       name = entry.nextLine();
	       System.out.println("");
	       System.out.println("");
	       
	       System.out.println(name.charAt(0));
	       System.out.println(name.trim());
	       //System.out.println(name.indexOf());
	       System.out.println(name.length());
	       System.out.println(name.toLowerCase());
	       System.out.println(name.toUpperCase());
	       System.out.println("");
	       System.out.println("");
	       
	       System.out.print("Apologize for writing many times your name i just wanted to play lol!!");
	       name = entry.nextLine();
	       System.out.println("");
	       
	       //System.out.println("");
	       System.out.println("Let's Start " + name);
	       System.out.println("");
	       System.out.println("");
	       
	       
	       System.out.print("Could you type 2 numbers: ");
	       number1 = entry.nextFloat();
	       number2 = entry.nextFloat();
	       
	       
	       addition = number1+number2;
	       substraction = number1-number2;
	       multiplication = number1*number2;
	       division = number1/number2;
	       remainder = number1%number2;
	       
	       
	       System.out.println("The addition is: " +addition);
	       System.out.println("The substraction is: " +substraction);
	       System.out.println("The multiplication is: " +multiplication);
	       System.out.println("The division is: " +division);
	       System.out.println("The remainder is: " +remainder);
	       System.out.println("");
	       System.out.println("");
	       
	       
	       System.out.println("It was a pleasure to learn together " + name + "!!!");
	       System.out.println("");
	       System.out.println("");
	       
	    }
	}

	
