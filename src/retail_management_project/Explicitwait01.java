package retail_management_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.linkText("Registry")).click();
	//	clickOn(driver, driver.findElement(By.xpath("//button[@name='login']")), 20);
		//driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getWindowHandle());
		Set<String>handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		String parentid=it.next();
		
		System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
		driver.close();
		boolean childwindowid=it.hasNext();
		System.out.println(childwindowid);
		//System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
	//	clickOn(driver, driver.getTitle()+"\n"+driver.getCurrentUrl(), 30);
		driver.close();
		//System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
}
