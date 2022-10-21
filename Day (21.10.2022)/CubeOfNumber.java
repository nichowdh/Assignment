import java.util.Scanner;

//Write a program in Java to display the cube of the number
//upto given an integer..

public class CubeOfNumber {
	public static void main(String[] args) {
		int num; // data variables
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in); // user input
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) { // for loop condition
			System.out.println("Answer is :" + (i * i * i));
		}
	}

}
