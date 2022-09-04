package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	@Test
	public void test1() 
	{
		SoftAssert s=new SoftAssert();
		System.out.println("Execution of Test1 Started");
		s.assertEquals(200, 201, "Check if it is fail");
		System.out.println("Checking First assertion");	
		s.assertAll();
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Execution of Test2 Started");
		Assert.assertEquals(200, 201, "Check if it fail");
		System.out.println("Checking First assertion");            
	}

}
