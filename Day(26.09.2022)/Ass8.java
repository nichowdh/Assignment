//WAP to check leap-year
import java.util.Scanner;

class Ass8{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int y=s.nextInt();
		if(y%4==0)
		System.out.println("this is leap-year");
		else
		System.out.println("This is not a leap-year");
	}
}