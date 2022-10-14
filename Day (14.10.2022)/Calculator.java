/*2.Write a java program to illustrate Calculator class with addition, 
 subtraction,multiplication methods that can take any number 
 of parameters to perform the operation, without using method/constructor overloading*/

import java.util.Scanner;

public class Calculator { // claass
	public static void main(String args[]) { // method
		int first, second, add, subtract, multiply;
		Scanner sc = new Scanner(System.in); // scanner input
		System.out.print("Enter first Number : ");
		first = sc.nextInt();
		System.out.print("Enter second Number : ");
		second = sc.nextInt();

		// operations
		add = first + second;
		subtract = first - second;
		multiply = first * second;

		// printing Results
		System.out.println("Sum = " + add);
		System.out.println("Difference = " + subtract);
		System.out.println("Multiplication = " + multiply);

	}

}
