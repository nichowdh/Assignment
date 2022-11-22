
public class Problem2 {// class
	public void addTwopositive(int a, int b) throws ArithmeticException { // method to claculate
		if (a < 0 && b < 0) {// id condition
			throw new ArithmeticException("Non-positive Integer Sent");
		} else {
			System.out.println("Sum of the Integers: " + (a + b));
		}
	}

	public static void main(String[] args) { // main method
		Problem2 obj = new Problem2();// object creation
		obj.addTwopositive(-10, -20);// passing value
	}

}
