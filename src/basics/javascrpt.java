package basics;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascrpt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(" https://html.com/input-type-file/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.location=' https://opensource-demo.orangehrmlive.com/'");
	//driver.findElement(By.id("fileupload"));

	//js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("fileupload")));
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	
	}

}
