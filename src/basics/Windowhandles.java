package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.keralartc.com/main.html");
		
		
		driver.getWindowHandle();// one window handler ,which is currently loaded by the selenium ..retuns string
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());

		//driver.findElement(By.partialLinkText("E-TICKE")).click();
		driver.findElement(By.xpath("//a[text()='E-Ticketing']")).click();

		Set<String> handler = driver.getWindowHandles();
		System.out.println(driver.getTitle());

		Iterator<String> it = handler.iterator();
		String prntwindowid = it.next();
		System.out.println("prntwindowid is " + prntwindowid);
		Thread.sleep(3000);
		
		System.out.println("********");
		System.out.println(it.hasNext());;//true
		System.out.println("********");
		String chldwindowid = it.next();
		System.out.println("chldwindowid is " + chldwindowid);
		Thread.sleep(3000);
		System.out.println("********");
		System.out.println(it.hasNext());;//false
		System.out.println("********");
		
		driver.switchTo().window(chldwindowid);
		System.out.println(driver.getWindowHandle());
		System.out.println("parent window title"+driver.getTitle());
	

		driver.switchTo().window(prntwindowid);
		System.out.println("child window title"+driver.getTitle());
	
		driver.quit();
	}

}
