package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_commands {

	public static void main(String[] args) throws InterruptedException {
		// navigateTo();
		// back();
		// forward();
		// refresh();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		System.out.println("page title-1:" + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Gm")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();

	}

}
