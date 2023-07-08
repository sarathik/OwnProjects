package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGDemo {
	
	@BeforeClass
	public void beforeTest() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterTest() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Test or Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Test or After Method");
	}
	
	
	@Test(priority=1)
	public void testCase1() {
		System.out.println("This is the Test Case 1 - Confirmation");
	}
	
	@Test(priority=0, enabled=false)
	public void testCase2() {
		System.out.println("This is the Test Case 2 - Confirmation");
	}

}
