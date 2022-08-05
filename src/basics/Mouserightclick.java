package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouserightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement gamil=driver.findElement(By.partialLinkText("Gma"));
//		Actions act=new Actions(driver);
//		act.contextClick(gamil).build().perform();
		
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.partialLinkText("Gma"))).build().perform();
	//act.doubleClick();
	
	
	}

}
