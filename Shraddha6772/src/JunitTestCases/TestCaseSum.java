package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Junit.Sum;
import junit.framework.Assert;

public class TestCaseSum {

	@Test
	public void test() {

		Sum obj = new Sum();
		int result = obj.sum(5,5);
		Assert.assertEquals(10, result);
		
	
	}

}
