package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;//WebDriver Interface is already available in the Selenium,Just import to utilize Webdriver 

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToOrangeHRM {

	public static void main(String[] args) throws InterruptedException {// main method ,starting point of the program execution

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		// Selenium is not integrated with the browsers,So we have to set the path of
		// any browser to execute the web applications by using selenium

		WebDriver driver = new ChromeDriver(); // Chrome browser will be launched by this statement

		driver.manage().window().maximize(); // maximize the browser window
	
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		//the browser is now handled by the driver object
		//this Statement will enter and launch the Url in the Chrome Browser
				
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	
		//driver has to identify the username text box Element in webpage, next entered the username by using the sendkeys() method. 
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//driver has to identify the password text box Element in webpage, next entered the password by using the sendkeys() method.
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//driver has to identify the login button Element in webpage, next perform the click action by th click() method. 
	driver.findElement(By.id("spanMessage"));
	
	
	
	}
}






