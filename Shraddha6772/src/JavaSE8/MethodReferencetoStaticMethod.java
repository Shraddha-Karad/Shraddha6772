package JavaSE8;

interface Engine2 {
	abstract public void speed();
}

class Car2 {
	public static void average() {
		System.out.println("The averge of the car is very Good");
	}
}

public class MethodReferencetoStaticMethod {
	public static void main(String[] args) {
		// Using Lamda epression
		Engine2 obj = () -> System.out.println("Speed is Good");
		obj.speed();
		// Lamda replaced with static method Reference
		Engine2 obj1 = Car2::average;
		obj1.speed();
	}
}