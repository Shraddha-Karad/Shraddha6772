package Strings;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	public static void main(String[] args) {

		StringJoiner Names = new StringJoiner(",", "[", "]");

		Names.add("Ritika");
		Names.add("Shivani");
		Names.add("Kritika");
		Names.add("Artika");
		System.out.println(Names);
	}
}
