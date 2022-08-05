package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersclass {
	WebDriver driver;
	@Test
	@Parameters({ "browser","url", "emailid", "password" })
	public void swhizzadmin(String browser,String url, String emailid, String password) throws InterruptedException {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(emailid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys(password);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
		driver.close();
	}
}
//Parameters is used to create the generic source code,which we use no.of times to execute the other test cases,in this we use environment variables
//Data provider:Excel sheet 
//