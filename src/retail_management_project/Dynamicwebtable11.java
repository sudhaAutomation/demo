package retail_management_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crompton36-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srikanth.bellamkonda@crompton.com.devorg");
		;
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Pass@12345");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Login' and @value='Log In']")).click();
		//Thread.sleep(2000);
		////a[text()='test2, test1']
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Set<String>handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		
		
		driver.findElement(By.xpath("//body[@onload='if(this.bodyOnLoad)bodyOnLoad();']")).click();
		System.out.println(it.hasNext());
		
		String parentwindowid=it.next();
		System.out.println("parent window id is "+parentwindowid);
		//String childwindowid=it.next();
		///System.out.println(it.hasNext());
		//System.out.println("child window id is "+childwindowid);
		//driver.switchTo().window(childwindowid);
		driver.close();
		System.out.println(driver.getTitle());
		String window=driver.getWindowHandle();
		
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		
	
	}

}
