//WAP to check Amstrong Number
public class Ass5 {

public static void main(String args[]) {
	int num = 153, n, temp, total = 0;
	n = num;
	while (n != 0) {
	temp = n % 10;
	total = total + (temp * temp * temp);
	n /= 10;
	}

	if (total == num)
	System.out.println(num + " is an Armstrong number");
	else
	System.out.println(num + " is not an Armstrong number");
	}
}
