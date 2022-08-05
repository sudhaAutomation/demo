package datepicker;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orncalender2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.keralartc.com/main.html");

		driver.getWindowHandle();// one window handler ,which is currently loaded by the selenium ..retuns string
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());

		// driver.findElement(By.partialLinkText("E-TICKE")).click();
		driver.findElement(By.xpath("//a[text()='E-Ticketing']")).click();

		//Set<String> handler = driver.getWindowHandles();
		System.out.println(driver.getTitle());

		// to select the month

		// driver.close();

	}

}
