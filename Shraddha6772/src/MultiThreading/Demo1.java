package MultiThreading;

import java.lang.reflect.GenericArrayType;

class A extends Thread {
	public void run() {
		System.out.println("Thread A is Started ");
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Value of i in Thread A " + i);
		}
		System.out.println("Thread A Exit !");
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Thread B is Started ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in Thread B " + i);
		}
		System.out.println("Thread B Exit !");
	}
}

class C extends Thread {
	public void run() {
		System.out.println("Thread C is Started ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in Thread C " + i);
		}
		System.out.println("Thread C Exit !");
	}
}

public class Demo1 {

	public static void main(String[] args) {

		A a = new A(); // New Born State
		B b = new B();
		C c = new C();

		int f = a.getPriority();
		b.setPriority(f);
		
		a.start(); // Runnable State Or Ready to run
		b.start();
		c.start();

	}

}
