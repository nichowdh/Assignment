import java.util.Scanner;

//write a java program that reads in two floating point numbers and 
//test wheather they are the same up to three decimal places

public class Floating_Point {
	public static void main(String[] args) {
		float a, b; // data variables
		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter 1st number: ");
		a = sc.nextFloat();
		System.out.println("Enter 2nd number: ");
		b = sc.nextFloat();
		a = Math.round(a * 1000);
		a = a / 1000;
		b = Math.round(b * 1000);
		b = b / 1000;
		if (a == b) { // if condition
			System.out.println("They are same upto 3 decimals");
		} else {
			System.out.println("they are different");
		}
	}

}
