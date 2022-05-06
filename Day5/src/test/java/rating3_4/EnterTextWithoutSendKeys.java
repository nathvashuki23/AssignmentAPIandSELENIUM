package rating3_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextWithoutSendKeys {
  @Test
  public void test() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		WebDriver driver= new ChromeDriver();   //Creating object for the chrome driver class
		driver.get("https://www.rediff.com/");  // Launch the application
		driver.manage().window().maximize(); // Maximizing the browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("document.getElementById('login1').value='vashukinath'");
		Js.executeScript("document.getElementById('password').value='abcdefgh12'");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
  }
}
