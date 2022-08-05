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

public class NewTest {
	@Test // Test Case we do writ as @Test
	public void urlTest() {
		System.out.println("Url Test case execution");
	}

	@Test
	public void loginTest() {
		System.out.println("Login test case execution");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method Execution");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method Execution");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class method Execution");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class method Execution");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method Execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test method Execution");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite method Execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite method Execution");
	}

}
