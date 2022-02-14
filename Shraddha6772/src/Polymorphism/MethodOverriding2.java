package Polymorphism;

class Tesla {

	void honk() {

		System.out.println("Toot, Toot !");
	}
}

class Roadster extends Tesla {

	void honk() {

		System.out.println("Broom, Wroom !");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {

		Tesla t = new Tesla();
		t.honk();

		Roadster r = new Roadster();
		r.honk();

	}
}
