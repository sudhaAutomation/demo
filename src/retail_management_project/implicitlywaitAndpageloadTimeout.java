package retail_management_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywaitAndpageloadTimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);// dynamic wait to load the Page,here 3o
																			// seconds is not a fixed time,if the page
		// takes 5 seconds to load ,the remaining 25
		// seconds are ignored and selenium will do
		// execute the next statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);// implicitly wait is the time for the componets
																		// to load while running and executing the code
						//driver.manage().timeouts().pageLoadTimeout(arg0, arg1)												

	}

}
