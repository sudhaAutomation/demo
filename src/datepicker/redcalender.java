package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redcalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(" https://www.redbus.in/");
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();// Jun 2022 30

		String expmonthyear = "Aug 2023";
		String expDate = "20";

		while (true) {
			// String
			// monthyear=driver.findElement(By.xpath("//td[contains(text(),'"+expmonthyear+"')]")).getText();
			String monthyear = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[2]"))
					.getText();
			System.out.println(monthyear);
			if (monthyear.equals(expmonthyear)) {
				System.out.print(" monthyear and expmonthyear both are matched");
				break;
			} else {
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();
				Thread.sleep(3000);
			}
		}
		//// body[1]/div[5]/table[1]/tbody[1]/tr/td

		driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr/td[text()=" + expDate + "]")).click();// date
																													// click
	}

}
