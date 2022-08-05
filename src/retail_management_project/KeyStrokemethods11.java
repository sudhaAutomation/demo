package retail_management_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyStrokemethods11 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		// driver.get("https://www.epfindia.gov.in//");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 Actions act = new Actions(driver);
		// driver.findElement(By.linkText("Gmail")).click();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		// act.sendKeys(Keys.ARROW_UP).build().perform();
		 WebElement gmailele=driver.findElement(By.partialLinkText("Gma"));
		 
act.contextClick(gmailele).build().perform();
Thread.sleep(3000);

		// creating an object for robot class which will help us to perform arrow
		// up,down,

//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_UP);
//		r.keyRelease(KeyEvent.VK_UP);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);

		driver.close();

	}

}
