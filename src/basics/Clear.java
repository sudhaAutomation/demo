package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dr=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input"));
		dr.sendKeys("$%^DGGFGBVBCDghhh");
		Thread.sleep(2000);
		dr.clear();
		Thread.sleep(2000);
		//.sendKeys("admin@admin.com");
		
	
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

		//driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		driver.quit();
	}

}
