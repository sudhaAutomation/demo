package basics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.ESCAPE).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		act.sendKeys(Keys.ARROW_LEFT).build().perform();
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	}

}
