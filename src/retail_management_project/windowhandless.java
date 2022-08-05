package retail_management_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandless {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(" https://www.keralartc.com/main.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("E-TICKE")).click();
		Thread.sleep(3000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		//System.out.println("after enter the E-TICKETING link the iterator is having the windows" + it.hasNext());// true

		String prntwindowid = it.next();
		System.out.println("prntwindowid is " + prntwindowid);
		Thread.sleep(3000);
		//System.out.println("after moving the iterator from the parent window the windows are " + it.hasNext());
		String chldwindowid = it.next();
		System.out.println("chldwindowid is " + chldwindowid);
		//System.out
			//	.println("after moving the iterator from the child window to further the windows are " + it.hasNext());
driver.switchTo().window(chldwindowid);
		driver.close();
		
		driver.switchTo().window(prntwindowid);
		driver.close();
	}

}
