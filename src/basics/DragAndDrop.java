package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(" https://jqueryui.com/draggable/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
	WebElement	drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		action.clickAndHold(drag)
				.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		//action.moveToElement(drag).doubleClick();
		Thread.sleep(5000);
		driver.close();
	}

}
