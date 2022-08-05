package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// chrome browser will launch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.epfindia.gov.in/");
		takeScreeenshot("EPF_homepage");
		takeScreeenshot("EPF_homepage");
		takescrnshot("jsgfggh");
	}

	public static void takeScreeenshot(String fileName) throws IOException {
		// Stored in the file format in the file(name of the file)
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// screenshot will be taken by the
																				// getScreenshotAS method
		// copy the file into desired location into out pc by using copyfile method
		FileUtils.copyFile(file, new File(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\Screenshot of Automation_Training\\"
						+ fileName + ".png"));
	}

	public static void takescrnshot(String filename) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\Screenshot of Automation_Training\\"+filename+".png"));
	}

}
