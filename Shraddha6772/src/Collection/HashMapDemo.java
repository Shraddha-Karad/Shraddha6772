package Collection;

import java.util.*;

public class HashMapDemo {

	public static void main(String args[ ])
	{

	HashMap<String,String> map = new HashMap();

	map.put("Martyn", "A");
	map.put("Nelson", "F");
	map.put("Davis", "B");

	System.out.println("Name: " +map.get("Martyn"));
	System.out.println("ID: " + map.get("Nelson"));
	System.out.println("Address: " +map.get("David"));
	}
	
	
}
