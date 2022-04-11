package JavaSE8;

interface Engine3 {
	abstract public void speed();
}

class Car3 {
	public void wheel() {
		System.out.println("Car has wheels of MRF company");
	}
}

public class MethodReferenceToIntanceMethod {
	public static void main(String[] args) {
		// Using Lamda epression
		Engine3 obj = () -> System.out.println("Speed is Good");
		obj.speed();
		// Lamda replaced with instance method Reference
		Car3 car = new Car3();
		Engine3 obj4 = car::wheel;
	}
}	
