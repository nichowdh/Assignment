//we need to print the elements of the array which 
//are present in odd positions.
public class OddPosition { // class
	public static void main(String[] args) { // main method
		int arr[] = { 1, 2, 3, 4, 5, 6 }; // initialize the array
		for (int i = 0; i < arr.length; i = i + 2) { // for loop
			System.out.println("The Array present in odd position are: " + arr[i]);
		}
	}

}
