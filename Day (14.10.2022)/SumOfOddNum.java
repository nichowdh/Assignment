
/*1.write a java program to print sum of odd numbers upto N?*/
import java.util.Scanner;

public class SumOfOddNum { // main class
	public static void main(String args[]) { // main method
		int num, i, sum = 0; // local variables
		Scanner sc = new Scanner(System.in); // using scanner input
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		for (i = 0; i <= num; i++) { // for loop
			if ((i % 2) == 1) { // if loop
				sum += i;
			}
		}
		System.out.print("Sum of odd numbers between 0 to n is: " + num + " = " + sum);
	}
}
