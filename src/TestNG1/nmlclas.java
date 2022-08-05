package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nmlclas {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		System.out.println("BeforeMethod execution");

	}

	
//	@Test (priority=1)// Test Case we do writ as @Test
//	public void urlTest() {
//		System.out.println("Url Test case execution");
//		
//		if (true) {
//			driver.get(" https://opensource-demo.orangehrmlive.com/");
//			System.out.println("url lunched successfully");
//		} 
//		else {
//			System.out.println("url lunching failed");
//		}
//		
//	}

//	@Test (priority=2)// Test Case we do writ as @Test
//	public void urlTest1() {
//		System.out.println("Url Test case execution");
//
//		
//		if (true) {
//			driver.get(" https://opensource-demo.orangehrmlive");
//			System.out.println("url lunched successfully");
//			 
//		}
//	
//			System.out.println("url lunching failed");
//	
//		
//	}
	@Test (priority=1)// Test Case we do writ as @Test
	public void urlTest1() {
		System.out.println("Url Test case execution");

		String title=driver.findElement(By.xpath("//input[@id='txtUsername']")).getText();
		Assert.assertEquals(title, "username");
	
		
	}
//	@Test(dependsOnMethods="urlTest1")
//	public void loginPositiveTest() {
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		System.out.println("login with valid test data ");
//	}
//		
//		@Test(invocationCount=3)
//	public void loginTest() {
//		System.out.println("Login test case execution");
//	}
//		
//post conditions of the test case
	@AfterMethod
	public void tearDown() {
		System.out.println("after method execution");
		driver.close();
	}

	
//before method ,after method,@Test
}
