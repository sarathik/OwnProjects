package DTBasicSelenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BasicJUnitSample {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This is After Class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("This is before method test case");
	}
	
	@After
	public void afterTest() {
		System.out.println("This is after method test case");
	}
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("This is Test Case1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test Case2");
	}
	
	@Test
	public void test3() {
		System.out.println("This is Test Case3");
	}

}
