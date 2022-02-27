package MultiThreading;

class One implements Runnable
{
	public void run()
	{
		System.out.println("Thread One is Started ");
		for(int i = 1; i<=10;i++)
		{
			System.out.println("Value of i in Thread One "+i);
		}
		System.out.println("Thread One Exit !");
	}
}

class Two implements Runnable
{
	 public void run()
	{
		System.out.println("Thread Two is Started ");
		for(int i = 1; i<=10;i++)
		{
			System.out.println("Value of i in Thread Two "+i);
		}
		System.out.println("Thread Two Exit !");
	}
}

class Three implements Runnable
{
	public void run()
	{
		System.out.println("Thread Three is Started ");
		for(int i = 1; i<=10;i++)
		{
			System.out.println("Value of i in Thread Three "+i);
		}
		System.out.println("Thread Three Exit !");
	}
}


public class Demo2 {

	
	public static void main(String[] args) {
		
		One o = new One();   //New Born State
		Two t = new Two();
		Three th = new Three();

		Thread t1 = new Thread(o);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(th);
	
		t1.start();
		t2.start();
		t3.start();
		
	
	}
}
