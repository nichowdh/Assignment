//1. WJP to insert the specified element at the specified position in the linked list.
package ll;

import java.util.LinkedList;

public class SpecifiedElement {

	public static void main(String[] args) {
		// create list
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		System.out.println("List: " + l);
		// insert the specific element at index no. 2
		l.add(2, "Pallabi mam");
		System.out.println("Updated List: " + l);
	}

}
