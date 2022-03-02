package MultiThreading;
class A1 extends Thread {

	public void run() {
		System.out.println("Thread A1 is Started ");
		for (int i = 1; i <= 10; i++) {

			System.out.println("Value of i in Thread A1 " + i);
		}
		System.out.println("Thread A1 Exit !");
	}
}

class B1 extends Thread {
	public void run() {
		System.out.println("Thread B1 is Started ");
		for (int i = 1; i <= 10; i++) {

			System.out.println("Value of i in Thread B1 " + i);
		}
		System.out.println("Thread B1 Exit !");
	}
}

class C1 extends Thread {
	public void run() {

		System.out.println("Thread C1 is Started ");
		for (int i = 1; i <= 10; i++) {

			System.out.println("Value of i in Thread C1 " + i);
		}
		System.out.println("Thread C1 Exit !");
	}
}

class ThreadPriorityDemo {
	public static void main(String args[]) {

		A1 threadA = new A1();
		B1 threadB = new B1();
		C1 threadC = new C1();
	
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority() + 1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Start Thread A");

		threadA.start();
		System.out.println("Start Thread C");

		threadC.start();
		System.out.println("Exit from main thread ");

	}

}