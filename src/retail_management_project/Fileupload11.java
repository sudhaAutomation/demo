package retail_management_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basics.TakeScreenshot;

public class Fileupload11 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("fileupload"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\Testing\\pics\\admin.html");
		Thread.sleep(3000);
		
	}

}
