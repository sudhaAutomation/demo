package retail_management_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyStrokemethods22 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#left-panel > nav > ul.left-nav.md > li:nth-child(3) > a > span")).click();
		driver.findElement(By.className("sorting_1")).click();
		Thread.sleep(2000);
		//driver.findElement(By.)
		//driver.findElement(By.cssSelector("#myTable > tbody > tr:nth-child(1) > td.trControls2 > a:nth-child(1)"))
		//		.click();
		//Alert alert = driver.switchTo().alert();
		//String str3 = alert.getText();
		//System.out.println(str3);
		// alert.accept();
		// creating an object for robot class which will help us to perform arrow
		// up,down,left ,right operations
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();

	}

}
