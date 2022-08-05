package quickerdt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phpcaldr {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://phptravels.net/");
		String expDate = "24";

		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		while(true) {///html[1]/body[1]/div[3]/div[1]/table[1]
			String tabletext = driver.findElement(By.xpath("//body/div[3]/div[1]/table[1]")).getText();
			driver.navigate().refresh();
		if (tabletext.contains("Jul")) {
			
			break;
		} else {
			driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[3]/i[1]")).click();
			
			
			//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[text()=" + expDate + "]"))
				//	.click();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[text()='24']")).click();
	 }

	}
}
