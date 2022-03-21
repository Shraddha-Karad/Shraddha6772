package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class StringFrequency {

	// Using Collections.frequency()
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("code");
		list.add("code");
		list.add("java");
		list.add("code");

		// count the frequency of the word "code"
		System.out.println("The frequency of the word code is: " + Collections.frequency(list, "code"));
	}
}
