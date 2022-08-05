package quickerdt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
		String expDate = "24";
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		while(true) {
			String tabletext = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr/td[text()='July 2023']")).getText();
			
		if (tabletext.contains("July 2023")) {
			
			break;
		} else {
			driver.findElement(By.xpath("//button[@id='']")).click();
			
			
			//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[text()=" + expDate + "]"))
				//	.click();
		}
		
		driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr/td[text()=" + expDate + "]"))
				.click();
}}
}