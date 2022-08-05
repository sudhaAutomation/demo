package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Orangevalidation {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before method setup execution");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority=3)
	public void urltest() {
		System.out.println("this test case is with in valid url");
		
		String title = driver.findElement(By.id("logInPanelHeading")).getText();
		if (title.contains("LOGIN")) {
			System.out.println("url launched successfully");
		}
		else{
		System.out.println("url launching failed");
		}
	}

//	@Test(priority=2)
//	public void invalidurltest() {
//		driver.get("https://opensource-demo.orangehrmlive.in");
//		String title = driver.findElement(By.id("logInPanelHeading")).getText();
//		if (title.contains("LOGIN")) {
//			System.out.println("url launched successfully");
//		}
//		else{
//			System.out.println("url launching failed");
//			}
//	}
@Test(priority=2)
public void logintestvaliddata() {
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	System.out.println("login successfully with valid credentials");
	
}
@Test(priority=1)
public void titletest() {
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	System.out.println("login successfully with valid credentials");
	String title=driver.findElement(By.id("welcome")).getText();
	
	try {
		//Assert.assertEquals(title, "Welcome Pratham","title validation success");
		Assert.assertTrue(title.contains("welcome"), "title validation success");
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
	@AfterMethod
	public void tearDown() {
		System.out.println("After method tearDown execution");
		driver.close();
	}

}
