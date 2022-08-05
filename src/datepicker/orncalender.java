package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orncalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//to login into the application
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
		//to select the month
		
		Select selmonth=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		
		selmonth.selectByVisibleText("Aug");
		//to select the year
		
				Select selyear=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
				
				selyear.selectByVisibleText("2022");
				
				String expDate="24";
				////tbody/tr/td/a[text()='30'] 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//tbody/tr/td/a[text()="+expDate+"]")).click();
				
				
				Thread.sleep(3000);
				driver.close();
		
		
	}

}
