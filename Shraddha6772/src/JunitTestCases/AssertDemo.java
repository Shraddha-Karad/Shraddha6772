package JunitTestCases;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertDemo {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
	}

	@Test
	public void test() {
		String s1 = null;
		String s2 = "Welcome";
		assertNotNull(s2);
	}

	@Test
	public void test1()
	{
		String s1 = null;
		String s2 = "Java";
		assertNull(s1);
	}
	
	@Test
	public void test2()
	{
		String s1 = "Java";
		String s2 = "Java";
		assertSame(s1,s2);
	}
	
	@Test
	public void test3()
	{
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		assertArrayEquals(arr1,arr2);
	}
	
	@Test
	public void test4()
	{
		int c=(3>4) ? 5 : 9 ;
		assertTrue(c == 9);
	}
}
