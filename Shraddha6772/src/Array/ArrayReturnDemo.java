package Array;

import java.util.*;

public class ArrayReturnDemo {
	
	public static String[] return_Array() {
		
		// define string array
		String[] ret_Array = { "Java", "C++", "Python", "Ruby", "C" };
		
		// return string array
		return ret_Array;
	}

	public static void main(String args[]) {
		
		// call method return_array that returns array
		String[] str_Array = return_Array();
		
		System.out.println("Array returned from method:\n" + Arrays.toString(str_Array));
	}
}

