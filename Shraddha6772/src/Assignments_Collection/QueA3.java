package Assignments_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 Create an ArrayList which will be able to store only Strings.
 Create a printAll method which will print all the elements
 using an Iterator.
 */

public class QueA3 
{
	ArrayList<String> al = new ArrayList<String>();
	
	public void printAll()
	{
		
		al.add("Element 1");
		al.add("Element 2");
		al.add("Element 3");
		al.add("Element 4");
		al.add("Element 5");
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}	
	}
	
	public static void main(String[] args) {
		
		QueA3 q3 = new QueA3();
		q3.printAll();		
	}
}
