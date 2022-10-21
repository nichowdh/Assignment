import java.util.Scanner;
//Write a Java method to compute the future investment 
//value at a given interest rate for a specified number of years.
public class FutureInvestment {
	public static void main(String[] args) {
		// data variables
		int year;
		double inv_amount, rate_of_interest;
		Scanner sc = new Scanner(System.in);
		// user input
		System.out.println("Enter the Investment Amount: ");
		inv_amount = sc.nextDouble();
		System.out.println("Enter the Rate of Interest: ");
		rate_of_interest = sc.nextDouble();
		System.out.println("Enter the number of year: ");
		year = sc.nextInt();
		// monthly interest rate
		double monthly_rate_of_interest = rate_of_interest / 1200;
		// printinh the table
		System.out.println("The years of future value");
		for (int i = 1; i <= year; i++) { // for loop
			System.out.println("For year: " + i);
			System.out.println(investment(inv_amount, monthly_rate_of_interest, i));
		}
	}

	// method of future investment
	public static double investment(double invest_amount, double monthly_rate_of_interest, int i) {
		return invest_amount * Math.pow(1 + monthly_rate_of_interest, i * 12);
	}
}
