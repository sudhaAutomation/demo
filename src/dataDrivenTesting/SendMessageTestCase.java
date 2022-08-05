package dataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class SendMessageTestCase {
	WebDriver driver;

	@BeforeMethod

	public void setup() throws IOException {
		//Properties prop = new Properties();
		//FileInputStream file = new FileInputStream(
				//"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\automation.properties");
		//prop.load(file);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
	//	driver.findElement(By.xpath(prop.getProperty("objusername")));
		
	}

	@DataProvider
	public String[][] gettestdata() throws IOException {
		String[][] testdata = Utilclass.getexceldata();
		return testdata;
	}

	@Test(dataProvider = "gettestdata")
	public void sendBulkMessage(String SelectCategory, String CourseName, String CourseUrl, String Message,
			String ExpResults) {
		driver.findElement(By.partialLinkText("Send Message")).click();

		Select drop = new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		drop.selectByVisibleText(SelectCategory);
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys(CourseName);// course name text box
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys(CourseUrl);// course url text box
		driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']")).sendKeys(Message);// mesage
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String act = driver.getTitle();
		System.out.println(act);
		String exp = "Software Training Institute and Consulting Services in Hyderabad | Swhizz";
		if (ExpResults.equals("Pass")) {

			if (exp.equals(act)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}

		} else if (ExpResults.equals("Fail")) {
			if (exp.equals(act)) {
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}

		}

	}

	@AfterMethod
	public void teardown() {
		driver.close();

	}

}
