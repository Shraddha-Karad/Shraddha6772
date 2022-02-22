package JunitTestCases;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Junit.Mul;
import junit.framework.Assert;
public class TestCaseMul {

	
	@Before
	public void before(){
		System.out.println("Before TestCase");
	}
	
	@Test
	public void test() {

	Mul obj = new Mul();
	int result = obj.mul(5,5);
	Assert.assertEquals(25, result);
	
	}
	
	@Test
	public void test2(){
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		assertArrayEquals(a,b);
		
	}

	@After
	public void after(){
		
		System.out.println("After TestCase");
	}
	
}
