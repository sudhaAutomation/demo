package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtablehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// to login into the application
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		// to go to table
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();

		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/a[1]
		// tr is the table row
		// td is table column
		int rows = driver
				.findElements(By.xpath(
						"/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr"))
				.size();
		System.out.println("no of rows in the table are " + rows);

		int cols = driver.findElements(By
				.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td"))
				.size();
		System.out.println("no of columns in the table are " + cols);

		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/a[1]
		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/a[1]
		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[3]/td[2]

		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[4]/td[2]/a[1]
		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[5]/td[2]
		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[48]/td[2]/a[1]

		String firsthalfxpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[";
		// String secondhalfXpath="]/td[2]";
		/// html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[48]/td[2]/a[1]
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= cols; j++) {
				String tabledata = driver.findElement(By.xpath(firsthalfxpath + i + "]/td[" + j + "]")).getText();
				System.out.print(tabledata + "        ");
				driver.findElement(By.xpath(firsthalfxpath + i + "]/td[" + j + "]")).click();
				if (tabledata.contains("Dominic Chase")) {
					driver.findElement(By.xpath(firsthalfxpath + i + "]/td[1]")).click();

					driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
					break;
					// }
				}
				System.out.println();
			}
			driver.close();
		}
	}
}
