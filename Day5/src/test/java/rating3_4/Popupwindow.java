package rating3_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupwindow {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;  // Driver Object for Interface
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		driver=new ChromeDriver();
		driver.navigate().to("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);



		driver.findElement(By.xpath("//span[@class='hamburger-section'][@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='login-button'][@rel='nofollow']")).click();
		Thread.sleep(2000);



		System.out.println(driver.getTitle());
		Thread.sleep(2000);



		driver.findElement(By.xpath("//button[@id='popup_modal_dismiss_button']")).click();



		System.out.println(driver.getTitle());



		// driver.findElement(By.id("popup_modal_dismiss_button")).click();
  }
}
