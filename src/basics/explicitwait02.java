package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait02{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//this is to load the paeg with that page data
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//applicable for all the elements in the page
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		//explict wait is only for expected element,where we feel the time is required to load
	WebElement	loginele=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='btnLogin']"))));
		
		
		
		
	}

}
