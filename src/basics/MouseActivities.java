package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActivities {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.epfindia.gov.in/");
		Actions action = new Actions(driver);//
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Establishments']"))).build().perform();
		Thread.sleep(4000);
		System.out.println("home page title 1" + driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Exempted Return Manual']")).click();
		Thread.sleep(6000);
		System.out.println("exempted manual page " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
		
		

	}

}
