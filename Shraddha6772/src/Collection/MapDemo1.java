package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String args[]) {
		Map<String, String> obj = new HashMap<String, String>();

		obj.put("India", "Delhi");
		obj.put("USA", "New York");
		obj.put("China", "Beijing");
		obj.put("Japan", "Tokyo");

		System.out.println(obj);
		
		boolean a = obj.containsKey("USA");
		System.out.println(a);

		System.out.println("Keys - "+ obj.keySet());
		System.out.println("Value - "+obj.values());
		
		
		Set s = obj.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {

			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey() + " " + me.getValue());

		}

	}
	
}
