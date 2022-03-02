package Assignments_Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 Create an ArrayList which will be able to store only numbers
 like int,float,double,etc, but not any other data type.
*/

public class QueA4 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(3);
		list.add(2.2f);
		list.add(3.14d);
		list.add("string");
		
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			Object el = itr.next();
			
			if(el instanceof Integer || el instanceof Float || el instanceof Double)
			{
				System.out.println(el);
				continue;
			}
			else
			{
				System.out.println("Invalid Data Entered so Exception Occured !");
				throw new IOException();
			}
		}
		
	}

	
}
