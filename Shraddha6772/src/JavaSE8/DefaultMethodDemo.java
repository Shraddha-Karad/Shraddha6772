package JavaSE8;

interface TestInterface {
	public void square(int a); // abstract method

	default void show() // default method
	{
		System.out.println("Default Method Executed");
	}
}

class DefaultMethodDemo implements TestInterface {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.square(4); // default method executed

		d.show();
	}
}
