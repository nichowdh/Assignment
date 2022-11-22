
public class MyCalculator { // class
	long Power(int n, int p) throws Exception { // long method

		if (n < 0 || p < 0) { // if condition
			throw new Exception("N or P should not be negative");
		} else if (n == 0 && p == 0) { // else if condition
			throw new Exception("n & p should not be zero");
		} else { // else condition
			System.out.println("Both Are Positive Number");
		}
		return n ^ p;

	}

	public static void main(String[] args) throws Exception { // main method
		MyCalculator ob = new MyCalculator();// object creation
		ob.Power(10, 20); // pasing value
	}

}
