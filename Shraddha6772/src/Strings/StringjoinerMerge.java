package Strings;

import java.util.StringJoiner;

public class StringjoinerMerge {

	public static void main(String[] args) {

		StringJoiner Names = new StringJoiner(",", "[", "]");

		Names.add("Rahul");
		Names.add("Raju");
		StringJoiner Names2 = new StringJoiner(":", "#", "#");

		Names2.add("Peter");
		Names2.add("Raheem");
		StringJoiner merge = Names.merge(Names2);

		System.out.println(merge);

	}
}
