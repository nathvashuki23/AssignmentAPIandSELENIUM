package assignment2;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot {

	WebDriver d;  // Driver Object for Interface
	String url="https://api.jquery.com/dblclick/";
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		d=new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url);  // Launch the application
		d.manage().window().maximize(); // Maximizing the browser
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		d.close();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		
		//Screenshot1
				File scr1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scr1,new File("D:\\Screenshots\\WebPage.png"));
				
				
				
			
				/*d.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		
				
				//Screenshot2
				File scr2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scr2,new File("D:\\Screenshots\\MyAccount.png"));*/
				
				
				
			}

}
