
package retail_management_project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable22 {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//login successful
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		//table opene

       //html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/thead[1]/tr[1]/th[1]/input[1]
	//  /html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]
	
	//  /html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[2]/td[1]/input[1]
	//  /html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[3]/td[1]
	   //html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[4]/td[1]/input[1]
	   //html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[5]/td[1]/input[1]
	  ///html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[19]/td[1]/input[1]	
	   //html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[45]/td[1]/input[1]	
		
		//System.out.println(driver.);
		
		
		System.out.println("no of rows the table contains are "+driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr")).size());
		System.out.println("no of columns the table contains are "+driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td")).size());
		String firsthalfxpath="html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[";
		String secondhalfxpath ="]/td[1]";
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Goutam.Ganesh')]")).getText());
		//html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]
		//String full xpath=firsthalfxpath
		int rowscount=46;
		int colscount =5;
		System.out.print("           User Name             user role           employee name              status");
		System.out.println();
		System.out.println("______________________________________________________________________________________");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <=2; j++) {
			//String	username=driver.findElement(By.xpath(firsthalfxpath+i+"]/td["+j+"]")).getText();
			System.out.print(driver.findElement(By.xpath(firsthalfxpath+i+"]/td["+j+"]")).getText()+"           ");
			//System.out.println();
			//System.out.println();
			}
			System.out.println();
			System.out.println("____________________________________________________________________________________");
		}
		
		for (int k = 1; k <=rowscount; k++) {
			String username=driver.findElement(By.xpath(firsthalfxpath+k+"]/td[2]")).getText();
			System.out.println(username);
			if (username.contains("Aravind")) {
				driver.findElement(By.xpath(firsthalfxpath+k+"]/td[1]")).click();
				//break;
			}
			
		}
		
		
		
		
	}

}
