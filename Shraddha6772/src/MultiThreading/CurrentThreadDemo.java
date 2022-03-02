package MultiThreading;

public class CurrentThreadDemo {
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		t.currentThread();
		
		System.out.println("Current Thread is :"+t);
		t.setName("My Thread");
		System.out.println("After Name Change : "+t);
		try 
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(i);
				Thread.sleep(2000);

			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Inturrpted ");
		}
		
	}
}
