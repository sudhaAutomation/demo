package basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(" https://www.epfindia.gov.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("Establishme"))).build().perform();
		// clickOn(driver, driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")), 30);
		//explicitwait1(driver, 30, driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")));
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]"))));
		
		Wait wait1=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(30, TimeUnit.SECONDS);
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]"))));
		driver.close();
	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

	public static void explicitwait(WebDriver driver, int timeOut, WebElement locator) {
		new WebDriverWait(driver, timeOut).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public static void explicitwait1(WebDriver driver, int timeOut, WebElement locator) {
		new WebDriverWait(driver, timeOut)
				.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
}
