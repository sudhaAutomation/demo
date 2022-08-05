package retail_management_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//button[@id='u_0_d_mW']")).click();

		
		
		WebElement loginele=new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='u_0_d_mW']"))));
	System.out.println(loginele.getText());
	}

	
}
