package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {

		TreeSet<String> tree = new TreeSet<String>();

		tree.add("Tokyo");
		tree.add("Denver");
		tree.add("Rio");
		tree.add("Nairobi");

		Iterator iterator = tree.iterator();

		while (iterator.hasNext())

		{

			System.out.println(iterator.next().toString());
		}
	}

}
