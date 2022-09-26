//Get input from user
import java.util.Scanner;
class Ass4{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter first number: ");
int i = s.nextInt();
System.out.println("Enter second number: ");
int j = s.nextInt();
int k = i + j;
System.out.println("Total: " + k);
}
}