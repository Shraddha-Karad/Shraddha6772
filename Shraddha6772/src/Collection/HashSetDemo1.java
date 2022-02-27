package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetDemo1 {

	public static void main(String args[]) {

		Set<String> s = new HashSet();
//		Set<String> s = new TreeSet();
//		Set<String> s = new LinkedHashSet();
		
		CopyOnWriteArraySet<String> liist = new CopyOnWriteArraySet<String>();
		
		s.add("Raman");
		s.add("Aman");
		s.add("Vijay");
		s.add("Babita");

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
