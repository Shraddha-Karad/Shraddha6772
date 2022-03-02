package Assignments_Collection;
/*
Develop a java class with a method saveEvenNumbers(int N)
using Vector to store even numbers from 2 to N, where N is a
integer which is passed as a parameter to the method
saveEvenNumbers().

The method should return the Vector (v1) created. In the
same class create a method printEvenNumbers()which iterates
through the Vector v1 in step 1, and It should multiply
each number with 2 and display it in format 4,8,12....2*N. and
add these numbers in a new Vector (v2).

The new Vector (v2) created needs to be returned. Create a
method printEvenNumber(int N) parameter is a number N. This
method should search the Vector (v1) for the existence of
the number ‘N’ passed. If exists it should return the Number
else return zero.Hint: Use instance variable for storing the
Vector v1 and v2.
NOTE: You can test the methods using a main method.
*/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class EvenNoUsingVector {

//	LinkedList<Integer> v = new LinkedList<Integer>();

	Vector<Integer> v1 = new Vector<Integer>();
	
	public Vector<Integer> saveEvenNumbers(int N) {
		v1 = new Vector<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
				v1.add(i);
		}

		return v1;
	}

	public int printEvenNumbers(int a) {

		Vector<Integer> v2 = new Vector<Integer>();
		boolean flag = false;
		int b = 0;

		for (int j : v1) {
			v2.add(j * 2);
			System.out.println(j * 2);

		}

		for (int j = 0; j < v2.size(); j++) {
			b = (v2.get(j));

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
		EvenNoUsingVector q1 = new EvenNoUsingVector();

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
