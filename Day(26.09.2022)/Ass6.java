//WAP to find Factorial of any number(user input )
import java.util.Scanner;

public class Ass6 {
	public static void main(String args[]) {
		int fact = 5;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
}
