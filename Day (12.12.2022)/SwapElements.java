//2. WJP of swap two elements in a linked list.
package ll;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {

	public static void main(String[] args) {
		// create list
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		System.out.println("List: " + l);
		Collections.swap(l, 1, 3); // using swap method()
		System.out.println("After Swap, List: " + l);
//		for (String a : l) { // for each loop
//			System.out.println(a);
//		}
	}

}
