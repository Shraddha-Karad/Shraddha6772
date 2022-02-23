package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String args[]) {

		Set hash = new HashSet();

		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("d");

		Iterator itr = hash.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
