package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();

		driver.findElement(By.partialLinkText("Send Message")).click();
		Select drop = new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		drop.selectByVisibleText("testing");
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys("Testing");// course name text box
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys("testing url ");// course url text box
		driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']")).sendKeys("testing in swihzz ");// mesage
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String act=driver.getTitle();
		String exp="ALL COURSES";
		System.out.println(act);
		driver.close();

	}

}
