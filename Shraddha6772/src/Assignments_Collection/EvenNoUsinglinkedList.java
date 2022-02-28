package Assignments_Collection;

/*
Develop a java class with a method saveEvenNumbers(int N)
using LinkedList to store even numbers from 2 to N, where N is a
integer which is passed as a parameter to the method
saveEvenNumbers().

The method should return the LinkedList (ll1) created. In the
same class create a method printEvenNumbers()which iterates
through the arrayList A1 in step 1, and It should multiply
each number with 2 and display it in format 4,8,12....2*N. and
add these numbers in a new LinkedList (ll2).

The new LinkedList (ll2) created needs to be returned. Create a
method printEvenNumber(int N) parameter is a number N. This
method should search the arrayList (A1) for the existence of
the number ‘N’ passed. If exists it should return the Number
else return zero.Hint: Use instance variable for storing the
LinkedList ll1 and ll2.
NOTE: You can test the methods using a main method.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class EvenNoUsinglinkedList {

	LinkedList<Integer> ll1 = new LinkedList<Integer>();

	public LinkedList<Integer> saveEvenNumbers(int N) {
		ll1 = new LinkedList<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
				ll1.add(i);
		}

		return ll1;
	}

	public int printEvenNumbers(int a) {

		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		boolean flag = false;
		int b = 0;

		for (int j : ll1) {
			ll2.add(j * 2);
			System.out.println(j * 2);

		}

		for (int j = 0; j < ll2.size(); j++) {
			b = (ll2.get(j));

			if (a == b) {
				flag = true;
			}

		}
		if (flag == true)
			return a;
		else
			return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EvenNoUsinglinkedList q1 = new EvenNoUsinglinkedList();

		int b = 0;
		System.out.println("Enter a Number : ");
		int N = sc.nextInt();

		q1.saveEvenNumbers(N);

		System.out.println("Enter the Number to search in the List : ");
		int a = sc.nextInt();
		System.out.println("------------------------------------------------");
		b = q1.printEvenNumbers(a);
		System.out.println();
		if (b != 0) {
			System.out.println(a + " Exists in List !");
		} else {
			System.out.println(a + " Doesn't Exist in List !");
		}
	}
}