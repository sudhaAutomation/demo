package retail_management_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshotex {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.epfindia.gov.in/");
		takesScreenshot("epf");
		// File src=((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);

	}

	public static void takesScreenshot(String Filename) throws IOException {
		//driver = new ChromeDriver();
		// take screen shot and store some file
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// copy the file into desired location using copyfile method
		FileUtils.copyFile(file, new File(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\Screenshot of Automation_Training\\"
						+ Filename + ".png"));
	
	}
}
