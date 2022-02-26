package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo {

	public static void main(String args[]) {
		Map<Integer, String> obj = new HashMap<Integer, String>();

		obj.put(new Integer(103), "David");
		obj.put(new Integer(101), "Ravi");
		obj.put(new Integer(102), "Amit");
		obj.put(new Integer(104), "Ram");

		Set s = obj.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {

			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey() + " " + me.getValue());

		}

	}

}
