package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginurl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Find Element(): is a method used to find the elements in the web page
		// NoSuchElemetFindException
		// FindElements(): used to finf the no of elements at a time...like if we want
		// to
		// Null
		// By is class......
		// driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("password")).sendKeys("123456");
		 * Thread.sleep(2000); //driver.findElement(By.name("submit")).submit();...1
		 * //driver.findElement(By.name("submit")).click();....2
		 * driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		 */

		// by using cssselector
		/*
		 * driver.findElement(By.
		 * cssSelector("body > div > div > div.middle > form > div:nth-child(1) > input"
		 * )).sendKeys("admin@admin.com"); Thread.sleep(2000); driver.findElement(By.
		 * cssSelector("body > div > div > div.middle > form > div:nth-child(2) > input"
		 * )).sendKeys("123456"); Thread.sleep(2000); driver.findElement(By.
		 * cssSelector("body > div > div > div.middle > form > div:nth-child(3) > input"
		 * )).click();
		 */

		// by Xpath
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		String str = driver.getTitle();
		System.out.println("the title of the page afetr login is " + str);

		if (str.equals("Admin")) {
			System.out.println("Login functionality is executed successfully");

		} else {
			System.out.println("Login functionality is executed successfully");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/section/div/div/aside/nav/ul[1]/li[6]/a/span")).click();
		Select sel = new Select(driver.findElement(
				By.xpath("/html/body/div/section/div/div/section/div/div/div/div/form/div[1]/div/select")));
		sel.selectByVisibleText("testing");
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("test");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#left-panel > nav > ul.left-nav.md > li:nth-child(3) > a > span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#myTable > tbody > tr:nth-child(1) > td.sorting_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#myTable > tbody > tr:nth-child(1) > td.trControls2 > a:nth-child(1)")).click();
		Thread.sleep(5000);
		Alert alrt=driver.switchTo().alert();
		System.out.println("this is confirmation message to delete the course "+alrt.getText());
		//alrt.accept();
		alrt.dismiss();
		Thread.sleep(5000);
		System.out.println("that cancel statemet executed");
		driver.close();// close() method is used to close the window which is opened by the selenium
		// Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
	}
}
