package Collection;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String args[]) {

		ArrayList list = new ArrayList();

		list.add(new String("Kritika"));
		list.add(new String("Ritika"));
		list.add(new String("Artika"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
