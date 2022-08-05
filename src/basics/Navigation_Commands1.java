package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands1 {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//dynamic Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Gm")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.epfindia.gov.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
		
		//navigate commands
		//navigate().to();
		//navigate().back();
		//naviaget().refresh()
		//naviaget().forward()
	}

}
