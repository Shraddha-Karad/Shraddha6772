package JavaSE8;

interface Engine1 {
	abstract public void speed();
}

class Car {
	public Car() {
		System.out.println("This is constructor of Car");
	}
}

public class MethodReferenceToConstructor {
	public static void main(String[] args) {
		// Using Lamda epression
		Engine1 obj = () -> System.out.println("Speed is Good");
		obj.speed();
		// Lamda replaced with instance method Reference
		Engine1 obj4 = Car::new;

		obj4.speed();
	}
}