//Write a Java program to find the duplicate values 
//of an array of integer values.
public class DuplicateArray { // class
	public static void main(String[] args) { // main method
		int[] arr = { 10, 20, 30, 20, 40, 50, 10, 30, 60 };// initialize the array
		for (int i = 0; i < arr.length; i++) { // for loop
			for (int j = i + 1; j < arr.length; j++) { // for each loop
				if (arr[i] == arr[j]) {
					System.out.println("duplicate arrays are present: " + arr[j]);
				}
			}

		}
	}

}
