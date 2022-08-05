package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_moveToElement {// this class and method will help us to move the curser to an element

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.epfindia.gov.in/");
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.linkText("Add-ons"))).build().perform();
	
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Directory')]"))).doubleClick().build().perform();
	}
}
