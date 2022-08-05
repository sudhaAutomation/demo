package retail_management_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_with_custom_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crompton36-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srikanth.bellamkonda@crompton.com.devorg");
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Pass@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Login' and @value='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add App']")).click();
		//driver.findElement(By.xpath("//*[@id=\"getting-started-block\"]/div[2]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
