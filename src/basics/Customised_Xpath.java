package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customised_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		// driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@value='Login']")).click();

		// PartialLinkText()
		// tagName() //a[text()='Add App']
		driver.get("https://crompton36-dev-ed.my.salesforce.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//dynamic Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//dynamic Wait
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srikanth.bellamkonda@crompton.com.devorg");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Pass@12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		// LinkText
		// driver.findElement(By.linkText("Add App")).click();
		// driver.findElement(By.xpath("//a[text()='Add App']")).click();
		// driver.findElement(By.partialLinkText("Add ")).click();

		// LinkText
		// xpath are 2 types:
		// Relative and absolute xpath
		driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);//static wait
		driver.close();
		
	}

}
