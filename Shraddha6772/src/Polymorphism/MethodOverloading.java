package Polymorphism;

public class MethodOverloading {

	public static int area(int side) {

		return side * side;
	}

	public static int area(int side1, int side2) {
		return side1 * side2;
	}

	public static void main(String[] args) {
		System.out.println(area(5));
		System.out.println(area(5, 2));

	}

}
