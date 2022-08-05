package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTest {
	//pre conditions of the test case
	@BeforeSuite//only once in a class it will execute
	public void beforeSuite() {
		System.out.println("Before suite method Execution");
	}

	@BeforeTest//only once in a class it will execute
	public void beforeTest() {
		System.out.println("Before Test execution");
	}

	@BeforeClass//only once in a class it will execute
	public void beforeClass() {
		System.out.println("Before class execution");
	}
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method execution");
	}

	@Test // Test Case we do writ as @Test
	public void urlTest() {
		System.out.println("Url Test case execution");
	}
	@Test
	public void loginTest() {
		System.out.println("Login test case execution");
	}
//post conditions of the test case
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method execution");
	}

	@AfterClass//only once in a class it will execute
	public void afterClass() {
		System.out.println("after class execution");
	}

	@AfterTest//only once in a class it will execute
	public void afterTest() {
		System.out.println("after Test execution");
	}

	@AfterSuite//only once in a class it will execute
	public void afterSuite() {
		System.out.println("After suite  method Execution");
	}
//before method ,after method,@Test
//before method ,after method,@Test
	
}
