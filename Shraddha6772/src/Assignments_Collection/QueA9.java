package Assignments_Collection;
/*
 Develop a java class with a instance variable CountryMap HashMap (M1)
 add a method saveCountryCapital(String CountryName, String capital) ,
 the method should add the passed country and capital as key/value in the map M1 and return the
Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class QueA9 {

	HashMap<String, String> M1 = new HashMap<String, String>();

	 HashMap<String,String> saveCountryCapital(String CountryName,String Capital)
	 {
		 M1.put(CountryName, Capital);

		 return M1;
	 }

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> M2 = new HashMap();

		QueA9 obj = new QueA9();
		
		String s1=null, s2 = null;

		System.out.println("Enter how many records you want to store in Map :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			
			System.out.println("Enter the Country Name : ");
			s1 = sc.next();

			System.out.println("Enyter Capital of Country : ");
			s2 = sc.next();

			M2 = obj.saveCountryCapital(s1,s2);
			
		}
		System.out.println();
		System.out.println("Country"+"   "+"Capital");
		System.out.println("-----------------------");
		

		Set s = M2.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {

			Map.Entry me = (Map.Entry) itr.next();
			System.out.printf("%-10s%-10s%n",me.getKey(),me.getValue());

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
