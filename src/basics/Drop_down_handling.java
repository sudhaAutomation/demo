package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		// driver.get("https://digitechinc.in/demos/1swishzz");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("get my application title " + driver.getTitle());
		String str = driver.getTitle();
		if (str.equalsIgnoreCase("admin Login")) {
			System.out.println("application url is launching succesfully");
		} else {
			System.out.println("application url is launching is failed");
		}
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(1000);
	
		System.out.println("after login the title is "+driver.getTitle());
		String str1=driver.getTitle();
		if (str1.equalsIgnoreCase("admin")) {
			System.out.println("login is successfull with the valid credentials");
		} else {
			System.out.println("login is failed  with the valid credentials");
		}
		driver.findElement(By.cssSelector("#left-panel > nav > ul.left-nav.md > li:nth-child(6) > a > span")).click();//send mesge elemt
		Thread.sleep(1000);
		String str2=driver.findElement(By.cssSelector("#right-panel > header > div > h3")).getText();//send
		
		System.out.println("title of the send bulk message page is  "+str2);
		driver.findElement(By.name("course_id")).click();
		Thread.sleep(2000);
		Select sele=new Select(driver.findElement(By.cssSelector("#right-panel > div > div > div > div > form > div:nth-child(1) > div > select")));
	sele.selectByVisibleText("testing");
	//sele.selectByValue(arg0);
	//sele.selectByIndex(arg0);
	Thread.sleep(3000);
	System.out.println("testing category is selected successfully");
	driver.findElement(By.id("first-name")).sendKeys("test-001");
		
	Thread.sleep(3000);
		
		driver.close();
		
	}

}
