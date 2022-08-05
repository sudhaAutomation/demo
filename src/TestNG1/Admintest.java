package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Admintest {
	WebDriver driver;

	@Test
	@Parameters({"browser","url","emailid","password"})
	public void logintest(String browser,String url,String emailid,String password) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(emailid);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys(password);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
		driver.close();
	}
}
