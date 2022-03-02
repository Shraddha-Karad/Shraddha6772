package MultiThreading;
class A2 implements Runnable {
	public void run() {
		System.out.println("Thread One is Started ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in Thread One " + i);
		}
		System.out.println("Thread One Exit !");
	}
}

class B2 implements Runnable {
	public void run() {
		System.out.println("Thread Two is Started ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in Thread Two " + i);
		}
		System.out.println("Thread Two Exit !");
	}
}

class C2 implements Runnable {
	public void run() {
		System.out.println("Thread Three is Started ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in Thread Three " + i);
		}
		System.out.println("Thread Three Exit !");
	}
}

public class LifeCycleDemo {
	public static void main(String[] args) {

		A2 o = new A2(); // New Born State
		B2 t = new B2();
		C2 th = new C2();

		Thread t1 = new Thread(o);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(th);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.suspend();
		for (int z = 0; z < 10; z++) {
			if (z == 5)
				t2.resume();
			System.out.println("Value of z : " + z);
		}
		t3.start();

	}
}
