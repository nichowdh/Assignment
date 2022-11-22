class MyException extends Exception {
	MyException(String str) {
		super(str);
	}
}

public class Problem1 {
	public static void main(String[] args) throws MyException {
		try {
			int a = 20 / 0;
		} catch (Exception e) {
			System.out.println("Invalid Division");
		}
		try {
			int num = Integer.parseInt("String");
		} catch (NumberFormatException a) {
			System.out.println("Format MisMatch");
		}
		try {
			String s = "Java developer";
			int i = s.charAt(17);
		} catch (IndexOutOfBoundsException ae) {
			System.out.println("Index is Invalid");
		}
		try {
			int[] arr = { 1, 2, 3, 4, 5 };
			int j = arr[6];
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("Array index is Invalid");
		}
		{
			String p = "pallabi";
			throw new MyException(p);
		}

	}

}
