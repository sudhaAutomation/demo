package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before method setup execution");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(groups="urlTest")
	public void urltest() {
		System.out.println("this test case is with in valid url");

		String title = driver.findElement(By.id("logInPanelHeading")).getText();
		if (title.contains("LOGIN")) {
			System.out.println("url launched successfully");
		} else {
			System.out.println("url launching failed");
		}
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			
			System.out.println("my error is "+e.getMessage());
		}
	}

	@Test(priority = 1, dependsOnMethods = "urltest",groups="LOGIN")
	public void logintestvaliddata() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("login successfully with valid credentials");

	}

	@Test(priority = 2, dependsOnMethods = "urltest",groups="LOGIN")
	public void logintestinvalid() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin1");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("login successfully with valid credentials");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After method tearDown execution");
		driver.close();
	}
}
