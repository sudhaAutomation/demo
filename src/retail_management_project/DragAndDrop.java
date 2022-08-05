package retail_management_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(" https://jqueryui.com/draggable/");
		driver.findElement(By.linkText("Droppable")).click();
		// driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Actions actions = new Actions(driver);
	//actions.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']")))
			//	.moveToElement(driver.findElement(By.xpath("//p[text()='Drop here']"))).release().build().perform();
		actions.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	Thread.sleep(5000);
		driver.close();

	}

}
