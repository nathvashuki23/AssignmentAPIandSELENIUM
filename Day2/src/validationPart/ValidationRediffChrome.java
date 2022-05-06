package validationPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationRediffChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		WebDriver driver= new ChromeDriver();   //Creating object for the chrome driver class
		driver.get("https://www.rediff.com/");  // Launch the application
		driver.manage().window().maximize(); // Maximizing the browser
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		String WTitle=driver.getTitle();
		System.out.println(WTitle);
		
		driver.findElement(By.id("login1")).sendKeys("vashuki");
		driver.findElement(By.id("password")).sendKeys("vshunth123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		
		String message=driver.findElement(By.id("div_login_error")).getText(); //Extract text data from webelement
		System.out.println(message);
		if (message.equals("Wrong username and password combination.")) {
			System.out.println("Testcase got passed");
		}else
		{
			System.out.println("Test case got failed");
		}
	}

}
