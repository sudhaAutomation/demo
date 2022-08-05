package quickerdt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expdcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.expedia.ca/");
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		String expDate = "24";
		String month=driver.findElement(By.xpath("//button[@id='d1-btn']")).getText();
		System.out.println(month);
		
		
		
		
		
		
	}

}
