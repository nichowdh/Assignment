/*Write a java program to illustrate Calculator class with addition, subtraction,
 multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading*/
import java.util.Scanner;

class Calculator1 { // class
	public static void main(String[] args) { // main method
		// local variables
		char c;
		Double number1, number2, result;

		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);

		// ask users to enter operator
		System.out.println("Choose an operator: +, -,or *");
		c = sc.next().charAt(0);

		// ask users to enter numbers
		System.out.println("Enter first number");
		number1 = sc.nextDouble();
		System.out.println("Enter second number");
		number2 = sc.nextDouble();

		switch (c) {
		// performs addition between numbers
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		// performs subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		// performs multiplication between numbers
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}

	}
}
