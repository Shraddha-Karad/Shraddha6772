package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String args[]) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add(new String("Blue"));
		lhs.add(new String("Purple"));
		lhs.add(new String("Magenta"));
		
		Object array[] = lhs.toArray();
		
		for (int i= 0; i < 3; i++) {
			System.out.println(array[i]);
		}
	}

}
