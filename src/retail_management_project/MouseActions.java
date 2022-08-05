package retail_management_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.epfindia.gov.in/");
		
		Actions action=new Actions(driver);
		
	action.moveToElement(driver.findElement(By.linkText("Establishment"))).build().perform();
	Thread.sleep(3000);
		driver.findElement(By.linkText("Directory")).click();
		
		Thread.sleep(3000);
		System.out.println("*****");
	//	action.moveToElement(driver.findElement(By.xpath("//a[@title='Establishments']"))).build().perform();
		Thread.sleep(3000);
		driver.close();

	}

}
