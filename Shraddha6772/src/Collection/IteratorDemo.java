package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add("C"); // add elements to the array list.
		al.add("A");
		al.add("E");
		al.add("B");

		// Display all contents of arraylist al.

		System.out.println("Original elements of al...." + al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {

			Object element = itr.next();
			System.out.println("Element..." + element);

		}
	}
}
